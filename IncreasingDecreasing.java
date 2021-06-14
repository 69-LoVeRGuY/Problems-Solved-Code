import java.io.*;
import java.util.*;
public class IncreasingDecreasing
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
            HashSet<Integer> hs=new HashSet();
            List<Integer> l=new ArrayList();
            Integer a[]=new Integer[n];
            int b[]=new int[200001];
            int f=0,max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>max)
                    max=a[i];
                hs.add(a[i]);
                b[a[i]]++;
                if(b[a[i]]>2)
                    f++;
                if(b[a[i]]==2)
                    l.add(a[i]);
            }
            if(hs.size()==n)
            {
                Arrays.sort(a);
                out.printLine("YES");
                for(int i=0;i<n;i++)
                    out.print(a[i]+" ");
                out.printLine();
                out.flush();
                continue;
            }
            if(f>0)
            {
                out.printLine("NO");
                out.flush();
                continue;
            }
            if(hs.size()>(n/2))
            {
                Object d[]=hs.toArray();
                Arrays.sort(d);
                Collections.sort(l,Collections.reverseOrder());
                if(l.contains(max))
                    out.printLine("NO");
                else
                {
                    out.printLine("YES");
                    for(int i=0;i<d.length;i++)
                        out.print(d[i]+" ");
                    for(int i=0;i<l.size();i++)
                        out.print(l.get(i)+" ");
                    out.printLine();
                }
            }
            else
                out.printLine("NO");
            out.flush();
        }
    }
}