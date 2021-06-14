import java.io.*;
import java.util.*;
public class GoodSubarrays
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
    static int count=0;
    static void subarray(int a[], int start, int end)
    {
        if(end==a.length)
            return;
        else if (start > end)  
            subarray(a, 0, end+1); 
        else
        { 
            int sum=0;
            for (int i = start; i < end; i++) 
            {
                sum=sum+a[i];
                if(sum>(end-start+1))
                    break;
            }
            sum=sum+a[end];
            if(start==end)
            {
                if(sum==1)
                    count++;
            }
            else
            {
                if(sum==(end-start+1))
                    count++;
            }
            subarray(a, start+1, end); 
        } 
        return;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
            subarray(a,0,0);
            out.printLine(count);
            out.flush();
            count=0;
        }
    }
}