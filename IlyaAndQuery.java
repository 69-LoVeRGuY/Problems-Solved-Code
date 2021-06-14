import java.io.*;
import java.util.*;
public class IlyaAndQuery
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
        String s=sc.next();
        int m=sc.nextInt();
        int a[]=new int[s.length()];
        Arrays.fill(a,0);
        int c=1;
        if(s.contains(".")==false || s.contains("#")==false)
        {
            for(int i=0;i<m;i++)
            {
                int l=sc.nextInt();
                int r=sc.nextInt();
                out.printLine(r-l);
                out.flush();
            }
            System.exit(0);
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                a[c]=1;
                a[c]+=a[c-1];
            }
            else
                a[c]=a[c-1];
            c++;
        }
        for(int i=0;i<m;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(l==1)
                out.printLine(a[r-1]);
            else
                out.printLine(Math.abs(a[r-1]-a[l-1]));
            out.flush();
        }
    }
}
