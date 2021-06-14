import java.io.*;
import java.util.*;
public class CF720B
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
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int count=0;
            List<String> list=new ArrayList();
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=1;i<n;i++)
            {
                if(gcd(a[i],a[i-1])!=1)
                {
                    count++;
                    int min=Math.min(a[i],a[i-1]);
                    if(i>=2)
                    {
                        if(gcd(a[i-2],min)!=1)
                        {
                            a[i-1]=1000000007;
                            a[i]=min;
                        }
                        else
                        {
                            a[i-1]=min;
                            a[i]=1000000007;
                        }
                    }
                    else
                    {
                        a[i-1]=min;
                        a[i]=1000000007;
                    }
                    String x=String.valueOf(i)+" "+String.valueOf(i+1)+" "+String.valueOf(a[i-1])+" "+String.valueOf(a[i]);
                    list.add(x);
                }
            }
            out.printLine(count);
            out.flush();
            for(int i=0;i<list.size();i++)
                out.printLine(list.get(i));
            out.flush();
        }
    }
}