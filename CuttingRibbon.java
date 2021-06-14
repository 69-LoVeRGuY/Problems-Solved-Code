import java.io.*;
import java.util.*;
public class CuttingRibbon
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
    static int n;
    static int r[];
    static int maxRibbons(int size[], int m, int V) 
    { 
       if (V == 0) 
            return 0; 
       int res = Integer.MIN_VALUE; 
       for (int i=0; i<m; i++) 
       { 
         if (size[i] <= V) 
         { 
             int sub_res;
             if(r[V-size[i]]!=0)
                sub_res=r[V-size[i]];
             else
             {
                 sub_res = maxRibbons(size, m, V-size[i]);
                 r[V-size[i]]=sub_res;
             }
             if (sub_res != Integer.MIN_VALUE && sub_res + 1 > res) 
                res = sub_res + 1; 
         } 
       } 
       return res; 
    } 
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        n=sc.nextInt();
        r=new int[n+1];
        int a[]=new int[3];
        for(int i=0;i<3;i++)
            a[i]=sc.nextInt();
        out.printLine(maxRibbons(a,3,n));
        out.flush();
    }
}