import java.io.*;
import java.util.*;
public class MissingAPoint
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
            HashMap<Integer,Integer> x=new HashMap();
            HashMap<Integer,Integer> y=new HashMap();
            int xans=0,yans=0;
            for(int i=0;i<((4*n)-1);i++)
            {
                int a=sc.nextInt();
                int o=sc.nextInt();
                if(x.containsKey(a))
                    x.put(a,x.get(a)+1);
                else
                    x.put(a,1);
                if(y.containsKey(o))
                    y.put(o,y.get(o)+1);
                else
                    y.put(o,1);
            }
            for(Map.Entry xi: x.entrySet())
            {
                int key=(int)xi.getKey();
                int value=(int)xi.getValue();
                if(value%2!=0)
                {
                    xans=key;
                    break;
                }
            }
            for(Map.Entry yi: y.entrySet())
            {
                int key=(int)yi.getKey();
                int value=(int)yi.getValue();
                if(value%2!=0)
                {
                    yans=key;
                    break;
                }
            }
            out.printLine(xans+" "+yans);
            out.flush();
        }
    }
}