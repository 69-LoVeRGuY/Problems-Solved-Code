import java.io.*;
import java.util.*;
public class GreatHero
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
    static class Pair
    {
        long a;
        long b;
        public Pair(long a, long b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            long ha=sc.nextLong();
            long hh=sc.nextLong();
            int n=sc.nextInt();
            long a[]=new long[n];
            long b[]=new long[n];
            int dm=0;
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            for(int i=0;i<n;i++)
                b[i]=sc.nextLong();
            Pair arr[]=new Pair[n];
            for(int i=0;i<n;i++)
                arr[i]=new Pair(a[i],b[i]);
            Arrays.sort(arr, new Comparator<Pair>() { 
            @Override public int compare(Pair p1, Pair p2) 
            { 
                return (int)(p1.a - p2.a); 
            } });
            for(int i=0;i<n;i++)
            {
                int q=(int)Math.ceil(arr[i].b/(double)ha);
                hh=hh-(q*arr[i].a);
                arr[i].b=arr[i].b-(ha*q);
                if(i<(n-1))
                {
                    if(hh<=0)
                        break;
                    else
                        dm++;
                }
                else
                {
                    long r=hh+arr[i].a;
                    long m=arr[i].b+ha;
                    if(r<=0 && m>0)
                        break;
                    else
                        dm++;
                }
            }
            if(dm==n)
                out.printLine("YES");
            else
                out.printLine("NO");
            out.flush();
        }
    }
}