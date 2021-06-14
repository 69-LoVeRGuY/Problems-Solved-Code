import java.io.*;
import java.util.*;
public class DifferentDivisor
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
    static boolean prime[]=new boolean[100001];
    static List<Integer> list=new ArrayList();
    static void sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=100000;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=100000;j+=i)
                    prime[j]=false;
            }
        }
        for(int i=2;i<=100000;i++)
        {
            if(prime[i])
                list.add(i);
        }
    }
    static int lowerBound(Integer a[], int x) 
    {
        int l=-1,r=a.length;
        while(l+1<r) 
        {
            int m=(l+r)>>>1;
            if(a[m]>=x) 
                r=m;
            else 
                l=m;
        }
        return a[r];
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        sieve();
        while(t-->0)
        {
            int d=sc.nextInt();
            Integer a[]=new Integer[list.size()];
            a=list.toArray(a);
            int x=1+d;
            int n1=lowerBound(a,x);
            int n2=lowerBound(a,(n1+d));
            long ans=(long)(n1*n2);
            out.printLine(ans);
            out.flush();
        }
    }
}