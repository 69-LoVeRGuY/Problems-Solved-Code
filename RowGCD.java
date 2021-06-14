import java.io.*;
import java.util.*;
public class RowGCD
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
    static long gcd(long a, long b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    static long findGcd(long a[],long c)
    {
        long result=a[0]+c;
        for(int i=1;i<a.length;i++)
            result=gcd((a[i]+c),result);
        return result;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s="";
        long a[]=new long[n];
        long b[]=new long[m];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        for(int i=0;i<m;i++)
            b[i]=sc.nextLong();
        for(int i=0;i<m;i++)
        {
            long ans=findGcd(a,b[i]);
            s=s+String.valueOf(ans)+" ";
        }
        out.printLine(s);
        out.flush();
    }
}