import java.io.*;
import java.util.*;
public class EhabAndSpecialColouringProblem
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
    static boolean prime[];
    static void sieveOfEratosthenes(int n)
    {
        prime=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        sieveOfEratosthenes(n);
        int f=1;
        for(int i=2;i<=n;i++)
        {
            if(prime[i])
            {
                for(int j=i;j<=n;j+=i)
                {
                    if(a[j]==0)
                        a[j]=f;
                }
                f++;
            }
        }
        for(int i=2;i<=n;i++)
            out.print(a[i]+" ");
        out.printLine();
        out.flush();
    }
}