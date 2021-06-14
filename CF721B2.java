import java.io.*;
import java.util.*;
public class CF721B2
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String r="";
            for(int i=n-1;i>=0;i--)
                r+=String.valueOf(s.charAt(i));
            int p=0,q=s.length()-1,diff=0;
            while(p<=q)
            {
                if(s.charAt(p)!=s.charAt(q))
                    diff++;
                p++;
                q--;
            }
            int zero=0;
            for(int i=0;i<n;i++)
                {
                    if(s.charAt(i)=='0')
                        zero++;
                }
            if(s.equals(r))
            {
                if(zero==1 && n%2==1 && s.charAt(n/2)=='0')
                {
                    out.printLine("BOB");
                    out.flush();
                    continue;
                }
                if(zero%2==0)
                {
                    out.printLine("BOB");
                    out.flush();
                    continue;
                }
                if(zero%2==1)
                {
                    out.printLine("ALICE");
                    out.flush();
                    continue;
                }
            } 
            else
            {
                if(n%2==1 && zero==2 && s.charAt(n/2)=='0')
                {
                    out.printLine("DRAW");
                    out.flush();
                    continue;
                }
                else
                {
                    out.printLine("ALICE");
                    out.flush();
                    continue;
                }
            }
        }
    }
}