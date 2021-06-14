import java.io.*;
import java.util.*;
public class NumberSpiral
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
            long x=sc.nextLong();
            long y=sc.nextLong();
            long ans=0;
            int inc=0;
            if(x>=y)
            {
                if(x%2==1)
                    inc=1;
                if(x%2==0)
                    ans=x*x;
                else
                    ans=(x*x)-((x*2)-2);
                if(y!=1)
                {
                    if(inc==1)
                        ans=ans+(y-1);
                    else
                        ans=ans-(y-1);
                }
            }
            else
            {
                if(y%2==0)
                    inc=1;
                if(y%2==1)
                    ans=y*y;
                else
                    ans=((y-1)*(y-1))+1;
                if(x!=1)
                {
                    if(inc==1)
                        ans=ans+(x-1);
                    else
                        ans=ans-(x-1);
                }
            }
            out.printLine(ans);
            out.flush();
        }
    }
}   