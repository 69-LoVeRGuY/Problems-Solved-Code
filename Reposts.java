import java.io.*;
import java.util.*;
public class Reposts
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
        int n=sc.nextInt();
        String s1[]=new String[n];
        String s2[]=new String[n];
        for(int i=0;i<n;i++)
        {
            String x[]=sc.nextLine().toLowerCase().split(" ");
            s1[i]=x[0];
            s2[i]=x[2];
        }
        HashMap<String,String> map=new HashMap();
        map.put("polycarp","");
        for(int i=0;i<n;i++)
            map.put(s1[i],s2[i]);
        int ans=1;
        for(Map.Entry<String,String> entry : map.entrySet())
        {
            String r=entry.getValue();
            int count=1;
            while(r!="")
            {
                count++;
                r=map.get(r);
            }
            ans=Math.max(ans,count);
        }
        System.out.println(ans);
    }
}