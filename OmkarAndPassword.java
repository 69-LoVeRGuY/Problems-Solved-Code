import java.io.*;
import java.util.*;
public class OmkarAndPassword
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
            List<Long> list=new ArrayList();
            HashSet<Long> set=new HashSet();
            for(int i=0;i<n;i++)
            {
                long a=sc.nextLong();
                list.add(a);
                set.add(a);
            }
            if(set.size()==1)
            {
                out.printLine(list.size());
                out.flush();
                continue;
            }
            out.printLine(1);
            out.flush();
        }
    }
}