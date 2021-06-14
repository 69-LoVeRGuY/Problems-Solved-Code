import java.io.*;
import java.util.*;
public class GrayCode
{
    static class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 
  
    public FastReader() 
    { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
  
    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
  
    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 
  
    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 
  
    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 
  
    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
}
    static class Output 
    {
        private final PrintWriter writer;
        
        public Output(OutputStream outputStream) 
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public Output(Writer writer) 
        {
            this.writer = new PrintWriter(writer);
        }
        
        public void print(Object...objects) 
        {
            for (int i = 0; i < objects.length; i++) 
            {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }
        
        public void printLine(Object...objects) 
        {
            print(objects);
            writer.println();
        }
        
        public void close() 
        {
            writer.close();
        }
        
        public void flush() {
            writer.flush();
        }
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int num=sc.nextInt();
        int n=(int)Math.pow(2,num);
        String s[]=new String[n];
        int max=Integer.MIN_VALUE;
        String zero="0000000000000000";
        for(int i=0;i<n;i++)
        {
            String b=Integer.toBinaryString(i);
            String a="";
            a=a+b.substring(0,1);
            for(int j=1;j<b.length();j++)
            {
                int d=Integer.parseInt(b.substring(j,j+1))^Integer.parseInt(b.substring(j-1,j));
                a=a+String.valueOf(d);
            }
            s[i]=a;
            if(a.length()>max)  
                max=a.length();
        }
        for(int i=0;i<n;i++)
        {
            int diff=max-s[i].length();
            s[i]=zero.substring(0,diff)+s[i];
            out.printLine(s[i]);
            out.flush();
        }
    }
}