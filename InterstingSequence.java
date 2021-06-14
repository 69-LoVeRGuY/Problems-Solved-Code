import java.io.*;
import java.util.*;
public class InterstingSequence
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
    static boolean prime[]=new boolean[1000001];
    static void sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=1000000;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=1000000;j+=i)
                    prime[j]=false;
            }
        }
    }
    static long factor(long a, long b)
    {
        long ans=0;
        for(long i=1;i*i<=b;i++)
        {
            if(b%i==0)
            {
                if(a%i==0)
                    ans=Math.max(ans,i);
                if(a%(b/i)==0)
                    ans=Math.max(ans,(b/i));
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        sieve();
        while(t-->0)
        {
            long k=sc.nextLong();
            long ans=0;
            for(long i=1;i<=(2*k);i++)
            {
                long a=k+(i*i);
                long b=(2*i)+1;
                int r=(int)b;
                if(a%b!=0 && prime[r]==true)
                    ans+=1;
                else
                    ans+=factor(a,b);
            }
            out.printLine(ans);
            out.flush();
        }
    }
}