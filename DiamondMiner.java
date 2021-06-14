import java.io.*;
import java.util.*;
import java.math.*;
public class DiamondMiner
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long mine[]=new long[n];
            long miner[]=new long[n];
            int m=0,mr=0;
            for(int i=0;i<(2*n);i++)
            {
                long x=sc.nextLong();
                long y=sc.nextLong();
                if(x==0)
                {
                    y=Math.abs(y);
                    miner[mr]=y;
                    mr++;
                }
                else
                {
                    x=Math.abs(x);
                    mine[m]=x;
                    m++;
                }
            }
            Arrays.sort(mine);
            Arrays.sort(miner);
            double ans=0.0;
                for(int i=0;i<n;i++)
                {
                    long n1=(long)Math.pow(mine[i],2);
                    long n2=(long)Math.pow(miner[i],2);
                    long f=n1+n2;
                    double num=Math.pow(f,0.5);
                    ans=ans+num;
                }
            out.printLine(ans);
            out.flush();
        }
    }
}