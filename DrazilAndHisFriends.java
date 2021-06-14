import java.io.*;
import java.util.*;
public class DrazilAndHisFriends
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
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int l[]=new int[m];
        Arrays.fill(a,0);
        Arrays.fill(l,0);
        int b=sc.nextInt();
        for(int i=0;i<b;i++)
        {
            int num=sc.nextInt();
            a[num]=1;
        }
        int g=sc.nextInt();
        for(int i=0;i<g;i++)
        {
            int num=sc.nextInt();
            l[num]=1;
        }
        int f=0;
        for(int i=0;i<=10000;i++)
        {
            int ai=i%n;
            int bi=i%m;
            if(a[ai]==0 && l[bi]==1)
            {
                f++;
                a[ai]=1;
            }
            else if(a[ai]==1 && l[bi]==0)
            {
                f++;
                l[bi]=1;
            }
            if(f==((n+m)-(b+g)))
                break;
        }
        if(f==(n+m-(b+g)))
            out.printLine("Yes");
        else
            out.printLine("No");
        out.flush();
    }
}