import java.io.*;
import java.util.*;
public class PrefixFlipE
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
            String s1=sc.next();
            String s2=sc.next();
            int count=0;
            List<Integer> list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    String r=s1.substring(0,i+1);
                    String q="";
                    for(int j=0;j<r.length();j++)
                    {
                        if(r.charAt(j)=='0')
                            q="1"+q;
                        else
                            q="0"+q;
                    }
                    list.add(i+1);
                    if(q.charAt(0)=='0')
                        q="1"+q.substring(1);
                    else
                        q="0"+q.substring(1);
                    r="";
                    list.add(1);
                    for(int j=0;j<q.length();j++)
                    {
                        if(q.charAt(j)=='1')
                            r="0"+r;
                        else
                            r="1"+r;
                    }
                    s1=r+s1.substring(i+1);
                    list.add(i+1);
                    count+=3;
                }
            }
            Integer a[]=new Integer[list.size()];
            a=list.toArray(a);
            out.print(count+" ");
            for(int j=0;j<a.length;j++)
                out.print(a[j]+" ");
            out.printLine();
            out.flush();
        }
    }
}