import java.io.*;
import java.util.*;
public class JustEatIt
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            long tot=0L;
            int neg=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                tot+=a[i];
                if(a[i]<0)
                    neg++;
            }
            long max_so_far=Long.MIN_VALUE,max_ending_here=0L;
            int in=0,taken=0;
            for(int i=0;i<n;i++)
            {
                max_ending_here+=a[i];
                in++;
                if(max_so_far<max_ending_here)
                {
                    max_so_far=max_ending_here;
                    taken=in;
                }
                if(max_ending_here<=0)
                {
                    max_ending_here=0;
                    in=0;
                }
            }
            if(tot>max_so_far || (tot==max_so_far && taken==n))
                out.printLine("YES");
            else
                out.printLine("NO");
            out.flush();
        }
    }
}