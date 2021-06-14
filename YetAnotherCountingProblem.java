import java.io.*;
import java.util.*;
public class YetAnotherCountingProblem
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
    static long gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int q=sc.nextInt();
            String s="";
            long hcf=gcd(a,b);
            long p=(a*b)/hcf;
            for(int i=0;i<q;i++)
            {
                long l=sc.nextLong();
                long r=sc.nextLong();
                if(r<Math.max(a,b) || p==Math.max(a,b))
                    s=s+"0"+" ";
                else if(r==Math.max(a,b))
                    s=s+"1"+" ";
                else if(l>=Math.max(a,b) && r>Math.max(a,b))
                {
                    long ans=r-l+1;
                    int c=1;
                    while(p*c<=r)
                    {
                        if(p*c<l)
                            c++;
                        else
                        {
                            if(((p*c)+(Math.max(a,b)-1))<=r)
                                ans-=Math.max(a,b);
                            else
                                ans=ans-(r-(p*c)+1);
                            c++;
                        }
                    }
                    s=s+String.valueOf(ans)+" ";
                }
                else if((l<=Math.min(a,b) && r>Math.max(a,b))||(l>Math.min(a,b) && r>Math.max(a,b)))
                {
                    long ans=r-Math.max(a,b)+1;
                    int c=1;
                    while(p*c<=r)
                    {
                        if(p*c<l)
                            c++;
                        else
                        {
                            if(((p*c)+(Math.max(a,b)-1))<=r)
                                ans=ans-Math.max(a,b);
                            else
                                ans=ans-(r-(p*c)+1);
                            c++;
                        }
                    }
                    s=s+String.valueOf(ans)+" ";
                }
            }
            out.printLine(s);
            out.flush();
        }
    }
}