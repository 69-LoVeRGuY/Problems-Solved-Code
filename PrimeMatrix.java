import java.io.*;
import java.util.*;
public class PrimeMatrix
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
    static List<Integer> list=new ArrayList();
    static void sieveOfEratosthenes()
    {
        int n=100010;
        prime=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i])
            {
                list.add(i);
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
        for(int i=1000;i<=n;i++)
        {
            if(prime[i])
                list.add(i);
        }
    }
    static int upperBound(Integer a[], int N, int X)
    {
        int mid;
        int low=0;
        int high=N-1;
        while(low<high)
        {
            mid=(low+high)/2;
            if(X>=a[mid])
                low=mid+1;
            else
                high=mid;
        }
        return a[low];
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        int c=0;
        int min=Integer.MAX_VALUE;
        sieveOfEratosthenes();
        prime[1]=false;
        prime[0]=false;
        Integer x[]=new Integer[list.size()];
        x=list.toArray(x);
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                if(prime[arr[i][j]]==false)
                {
                    int y=upperBound(x,x.length,arr[i][j]);
                    f=f+(y-arr[i][j]);
                }
            }
            if(f<min && f>=0)
                min=f;
        }
        for(int i=0;i<m;i++)
        {
            int f=0;
            for(int j=0;j<n;j++)
            {
                if(prime[arr[j][i]]==false)
                {
                    int y=upperBound(x,x.length,arr[j][i]);
                    f=f+(y-arr[j][i]);
                }
            }
            if(f<min && f>=0)
                min=f;
        }
        out.printLine(min);
        out.flush();
    }
}