import java.io.*;
import java.util.*;
public class BlockAdventure
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
            int m=sc.nextInt();
            int k=sc.nextInt();
            int h[]=new int[n];
            for(int i=0;i<n;i++)
                h[i]=sc.nextInt();
            int c=0;
            for(int i=0;i<n-1;i++)
            {
                int diff=Math.abs(h[i+1]-h[i]);
                if(diff<k)
                {
                    if(h[i]>=h[i+1])
                    {
                        if(h[i]>=(h[i]-h[i+1]+k))
                            m=m+(h[i]-h[i+1]+k);
                        else 
                            m=m+h[i];
                    }
                    else
                    {
                        int b=k-(h[i+1]-h[i]);
                        if(b<=h[i])
                            m=m+b;
                        else
                            m=m+h[i];
                    }
                }
                else if(diff>=k && h[i]>h[i+1])
                {
                    int f=h[i+1]-k;
                    if(f<=0)
                        m=m+h[i];
                    else
                        m=m+(h[i]-f);
                }
                else if(diff>k && m>=(diff-k))
                    m=m-(diff-k);
                else if(diff==k)
                {
                    if(h[i]>=h[i+1] && h[i]>=(h[i]-h[i+1]+k))
                        m=m+k+(h[i]-h[i+1]);
                    else if(h[i]>=h[i+1] && h[i]<(h[i]-h[i+1]+k))
                        m=m+h[i];
                    else
                        continue;
                }
                else
                {
                    c=-1;
                    break;
                }
            }
            if(c==-1)
                out.printLine("NO");
            else
                out.printLine("YES");
            out.flush();
        }
    }
}