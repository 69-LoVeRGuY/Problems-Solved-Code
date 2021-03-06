import java.io.*;
import java.util.*;
public class Codeforcessubstring
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
        Scanner sc=new Scanner(System.in);
        OutputWriter out=new OutputWriter(System.out);
        long k=sc.nextLong();
        out.print("codeforce");
        for(long i=1;i<=k;i++)
            out.print("s");
        out.printLine();
        out.flush();
    }
}