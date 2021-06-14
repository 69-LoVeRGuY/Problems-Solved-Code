import java.io.*;
import java.util.*;
public class EasyNumberChallenge
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
    static int factors(int n)
    {
        int r=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                r++;
                if((n/i)!=i)
                    r++;
            }
        }
        return r;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Integer.MIN_VALUE;
        long sum=0;
        List<Integer> list=new ArrayList();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                for(int k=1;k<=c;k++)
                {
                    list.add(i*j*k);
                    if((i*j*k)>max)
                        max=i*j*k;
                }
            }
        }
        Integer x[]=new Integer[list.size()];
        x=list.toArray(x);
        int store[]=new int[max+1];
        Arrays.fill(store,0);
        for(int i=0;i<list.size();i++)
        {
            if(store[x[i]]==0)
                store[x[i]]=factors(x[i]);
            sum=(sum%1073741824+store[x[i]]%1073741824)%1073741824;
        }
        out.printLine(sum);
        out.flush();
    }
}