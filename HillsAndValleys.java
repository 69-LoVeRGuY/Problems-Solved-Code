import java.io.*;
import java.util.*;
public class HillsAndValleys
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> h=new HashSet();
            HashSet<Integer> v=new HashSet();
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(i-1>=0 && i+1<n)
                {
                    if(a[i]>a[i-1] && a[i]>a[i+1])
                        h.add(i);
                    else if(a[i]<a[i-1] && a[i]<a[i+1])
                        v.add(i);
                }
            }
            Iterator<Integer> iter=v.iterator();
            int c=0;
            while(iter.hasNext())
            {
                int f=iter.next();
                if(h.contains(f+1))
                {
                    c=Math.max(1,c);
                    if(h.contains(f-1))
                        c=2;
                }
                else if(h.contains(f-1))
                {
                    c=Math.max(1,c);
                    if(h.contains(f+1))
                        c=2;
                }
            }
            int ans=h.size()+v.size();
            if(c==1)
                ans-=2;
            else if(c==2)
                ans-=3;
            else
                ans-=1;
            if(ans<0)
                out.printLine(0);
            else
                out.printLine(ans);
            out.flush();
        }
    }
}