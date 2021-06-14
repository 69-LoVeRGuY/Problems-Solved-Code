import java.io.*;
import java.util.*;
public class WierdSubtractionProcess
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
    static class OutputWriter 
    {
        private final PrintWriter writer;
        
        public OutputWriter(OutputStream outputStream) 
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public OutputWriter(Writer writer) 
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
    static long n,m;
    static int stepone()
    {
        int f=0;
        if(n==0 || m==0)
           f=-1;
        else
            f=2;
        return f;
    }
    static int steptwo()
    {
        int f=0;
        long q=n/m;
        if(q>=2)
        {
            if(q%2==0)
                n=n-(q*m);
            else
                n=n-((q-1)*m);
            f=1;
        }
        else
            f=3;
        return f;
    }
    static int stepthree()
    {
        int f=0;
        long q=m/n;
        if(q>=2)
        {
            if(q%2==0)
                m=m-(q*n);
            else
                m=m-((q-1)*n);
            f=1;
        }
        else
            f=-1;
        return f;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        n=sc.nextLong();
        m=sc.nextLong();
        int f=steptwo();
        while(f!=-1)
        {
            if(f==1)
                f=stepone();
            else if(f==2)
                f=steptwo();
            else if(f==3)
                f=stepthree();
        }
        out.printLine(n+" "+m);
        out.flush();
    }
}