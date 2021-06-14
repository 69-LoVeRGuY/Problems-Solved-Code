import java.io.*;
import java.util.*;
public class GameWithArray
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
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
    
    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
    
    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }
    
    public void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
        writer.print(objects[i]);
        }
    }
    
    public void printLine(Object...objects) {
        print(objects);
    writer.println();
    }
    
    public void close() {
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
        int n=sc.nextInt();
        int s=sc.nextInt();
        int a[]=new int[n];
        Arrays.fill(a,1);
        a[n-1]=(s-(n-1));
        int k=s/2,f=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(sum<k)
                sum+=a[i];
            if(sum==k)
            {
                f=1;
                break;
            }
            else if(sum>k)
                break;
        }
        if(f==0)
        {
            out.printLine("YES");
            for(int i=0;i<n;i++)
                out.print(a[i]+" ");
            out.printLine();
            out.printLine(s/2);
        }
        else
            out.printLine("NO");
        out.flush();
    }
}