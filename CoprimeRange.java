import java.io.*;
import java.util.*;
public class CoprimeRange
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
    static boolean prime[]=new boolean[1000010];
    static List<Integer> list=new ArrayList();
    static void sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<1000010;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<1000010;j+=i)
                    prime[j]=false;
            }
        }
        for(int i=2;i<1000010;i++)
        {
            if(prime[i]==true)
                list.add(i);
        }
    }
    static int LowerBound(Integer a[], int x) 
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
        return r;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        sieve();
        Integer a[]=new Integer[list.size()];
        a=list.toArray(a);
        while(t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int num=LowerBound(a,r);
            out.printLine(a[num]);
            out.flush();
        }
    }
}