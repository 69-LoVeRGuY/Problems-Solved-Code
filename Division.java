import java.io.*;
import java.util.*;
public class Division
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
    static List<Long> list=new ArrayList();
    static void factor(long q)
    {
        list.add(q);
        for(long i=2;i*i<=q;i++)
        {
            if(q%i==0)
            {
                list.add(i);
                if((q/i)!=i)
                    list.add((q/i));
            }
        }
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            long p=sc.nextLong();
            long q=sc.nextLong();
            if(q>p || (p>q && p%q!=0))
            {
                out.printLine(p);
                out.flush();
                continue;
            }
            factor(q);
            long ans=1;
            for(int i=0;i<list.size();i++)
            {
                long x=p;
                while(x%list.get(i)==0)
                {
                    x/=list.get(i);
                    if(x%q!=0)
                    {
                        ans=Math.max(ans,x);
                        break;
                    }
                }
            }
            list.clear();
            out.printLine(ans);
            out.flush();
        }
    }
}