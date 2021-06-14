import java.io.*;
import java.util.*;
public class BinaryStringReconstruction
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
            String s=sc.next();
            int x=sc.nextInt();
            int a[]=new int[s.length()];
            Arrays.fill(a,-1);
            if(s.length()==1)
            {
                out.printLine(0);
                out.flush();
                continue;
            }
            if(x>(s.length()/2))
            {
                int z=s.length()-x;
                String y=s.substring(z,x);
                if(y.contains("1"))
                {
                    out.printLine(-1);
                    out.flush();
                    continue;
                }
            }
            int f=0;
            for(int i=0;i<s.length();i++)
            {
                int r=0;
                if(i-x<0 && i+x<s.length())
                {
                    if(s.charAt(i)=='0')
                        a[i+x]=0;
                    else 
                        a[i+x]=1;
                }
                else if(i-x>=0 && i+x>=s.length())
                {
                    if(s.charAt(i)=='0')
                    {
                        if(a[i-x]==-1)
                            a[i-x]=0;
                        else if(a[i-x]!=0)
                        {
                            f=-1;
                            break;
                        }
                    }
                    else
                    {
                        if(a[i-x]==-1)
                            a[i-x]=1;
                        else if(a[i-x]!=1)
                        {
                            f=-1;
                            break;
                        }
                    }
                }
                else if(i-x>=0 && i+x<s.length())
                {
                    if(s.charAt(i)=='1')
                    {
                        if(a[i-x]==-1)
                            a[i-x]=1;
                        else if(a[i-x]!=1 && a[i+x]==-1)
                            a[i+x]=1;
                        else if(a[i-x]!=1 && a[i+x]!=1)
                        {
                            f=-1;
                            break;
                        }
                    }
                    else
                    {
                        if(a[i-x]==-1 && a[i+x]==-1)
                        {
                            a[i-x]=0;
                            a[i+x]=0;
                        }
                        else if(a[i-x]==0 && a[i+x]==-1)
                            a[i+x]=0;
                        else if((a[i-x]==0 && a[i+x]==1) || (a[i-x]==1 && a[i+x]==0) || (a[i-x]==1 && a[i+x]==1))
                        {
                            f=-1;
                            break;
                        }
                    }
                }
            }
            if(f==0)
            {
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]==-1)
                        out.print(1);
                    else
                        out.print(a[i]);
                }
                out.printLine();
            }
            else
                out.printLine(-1);
            out.flush();
        }
    }
}