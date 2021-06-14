import java.io.*;
import java.util.*;
public class TwoArrays
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
            int r=sc.nextInt();
            int a[]=new int[n];
            int min=Integer.MAX_VALUE;
            HashMap<Integer,Integer> map=new HashMap();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]<min)
                    min=a[i];
                if(map.containsKey(a[i]))
                    map.put(a[i],map.get(a[i])+1);
                else
                    map.put(a[i],1);
            }
            int result[]=new int[n];
            Arrays.fill(result,0);
            if(min>=r)
            {
                for(int i=0;i<n;i++)
                    out.print(result[i]+" ");
                out.printLine();
                out.flush();
                continue;
            }
            int e=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]<r)
                {
                    if(a[i]==r/2 && e%2==0)
                    {
                        result[i]=1;
                        e++;
                        continue;
                    }
                    if(a[i]==r/2 && e%2!=0)
                    {
                        e++;
                        continue;
                    }
                    int diff=r-a[i];
                    if(map.containsKey(diff) && diff>=a[i])
                        result[i]=1;
                }
            }
            for(int i=0;i<n;i++)
                out.print(result[i]+" ");
            out.printLine();
            out.flush();
        }
    }
}