import java.io.*;
import java.util.*;
public class KuriyamaStones
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
        long total=0,sum=0;
        long a[]=new long[n];
        Integer b[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
            total=total+b[i];
            a[i]=total;
        }
        Arrays.sort(b);
        long c[]=new long[n];
        for(int i=0;i<n;i++)
        {
            sum=sum+b[i];
            c[i]=sum;
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            int type=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            long ans=0;
            if(type==1)
            {
                if(l==1)
                    ans=a[r-1];
                else
                    ans=a[r-1]-a[l-1]+(a[l-1]-a[l-2]);
            }
            else
            {
                if(l==1)
                    ans=c[r-1];
                else
                    ans=c[r-1]-c[l-1]+(c[l-1]-c[l-2]);
            }
            out.printLine(ans);
            out.flush();
        }
    }
}