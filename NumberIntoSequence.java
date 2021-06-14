import java.io.*;
import java.util.*;
public class NumberIntoSequence
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
    static long[] primefactor(long n)
    {
        long a[]=new long[2];
        while(n%2==0)
        {
            a[0]=2;
            a[1]++;
            n/=2;
        }
        for(long i=3;i*i<=n;i+=2)
        {
            int pow=0;
            while(n%i==0)
            {
                pow++;
                n/=i;
                if(pow>a[1])
                {
                    a[1]=pow;
                    a[0]=i;
                }
            }
        }
        return a;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long a[]=primefactor(n);
            if(a[0]==0 && a[1]==0)
            {
                out.printLine(1);
                out.printLine(n);
                out.flush();
                continue;
            }
            System.out.println(a[1]);
            long p=1;
            List<Long> list=new ArrayList();
            for(long i=1;i<=a[1]-1;i++)
            {
                list.add(a[0]);
                p*=a[0];
            }
            long ans=n/p;
            list.add(ans);
            for(int i=0;i<list.size();i++)
                out.print(list.get(i)+" ");
            out.printLine();
            out.flush();
        }
    }
}