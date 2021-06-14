import java.io.*;
import java.util.*;
public class CreatingTheContest
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE,count=1;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        if(n==1)
        {
            out.printLine(1);
            out.flush();
            System.exit(0);
        }
        for(int i=1;i<n;i++)
        {
             if(a[i]<=2*a[i-1])
             {
                 count++;
                 if(count>max)
                    max=count;
             }
             else
                 count=1;
        }
        if(count>max)
            max=count;
        out.printLine(max);
        out.flush();
    }
}