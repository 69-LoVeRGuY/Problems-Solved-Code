import java.io.*;
import java.util.*;
public class GCDCompression
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
            int a[]=new int[2*n];
            int neven=0,nodd=0;
            List<Integer> odd=new ArrayList();
            List<Integer> even=new ArrayList();
            for(int i=0;i<(2*n);i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                {
                    neven++;
                    even.add(i+1);
                }
                else
                {
                    nodd++;
                    odd.add(i+1);
                }
            }
            if(neven==(2*n) || nodd==(2*n))
            {
                if(nodd==(2*n))
                {
                    for(int i=2;i<odd.size()-1;i+=2)
                        out.printLine(odd.get(i)+" "+odd.get(i+1));
                }
                else
                {
                    for(int i=2;i<even.size()-1;i+=2)
                        out.printLine(even.get(i)+" "+even.get(i+1));
                }
            }
            else if(neven%2!=0 && nodd%2!=0)
            {
                for(int i=1;i<odd.size()-1;i+=2)
                    out.printLine(odd.get(i)+" "+odd.get(i+1));
                for(int i=1;i<even.size()-1;i+=2)
                    out.printLine(even.get(i)+" "+even.get(i+1));
            }
            else if(neven%2==0 && nodd%2==0)
            {
                for(int i=2;i<odd.size()-1;i+=2)
                    out.printLine(odd.get(i)+" "+odd.get(i+1));
                for(int i=0;i<even.size()-1;i+=2)
                    out.printLine(even.get(i)+" "+even.get(i+1));
            }
            out.flush();
        }
    }
}