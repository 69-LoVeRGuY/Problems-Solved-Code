import java.io.*;
import java.util.*;
public class AlarmClockEverywhere
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
        // TRY USING GCD
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long a[]=new long[n];
        HashSet<Long> set=new HashSet();
        int k=-1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
            if(i>0)
            {
                long v=a[i]-a[i-1];
                set.add(v);
            }
        }
        Long diff[]=new Long[set.size()];
        diff=set.toArray(diff);
        Arrays.sort(diff);
        long b[]=new long[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextLong();
            if(k==-1)
            {
                int count=0;
                for(int j=0;j<set.size();j++)
                {
                   if(diff[j]%b[i]==0)
                        count++;
                   else
                        break;
                }
                if(count==set.size())
                   k=i;
            }
        }
        if(k==-1)
            out.printLine("NO");
        else
        {
            out.printLine("YES");
            out.printLine(a[0]+" "+(k+1));
        }
        out.flush();
    }
}