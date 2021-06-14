import java.io.*;
import java.util.*;
public class MissingCoinSum
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
    static HashSet<Long> set=new HashSet();
    static void subsetSum(long a[], int l, int r, long sum)
    {
        if(l>r)
        {
            set.add(sum);
            return;
        }
        subsetSum(a,l+1,r,sum+a[l]);
        subsetSum(a,l+1,r,sum);
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        subsetSum(a,0,n-1,0);
        for(long i=1;;i++)
        {
            if(set.contains(i)==false)
            {
                out.printLine(i);
                out.flush();
                System.exit(0);
            }
        }
    }
}