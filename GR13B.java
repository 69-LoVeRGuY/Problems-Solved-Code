import java.io.*;
import java.util.*;
public class GR13B
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
    static class Output 
    {
        private final PrintWriter writer;
        
        public Output(OutputStream outputStream) 
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public Output(Writer writer) 
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
        Output out=new Output(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long u=sc.nextLong();
            long v=sc.nextLong();
            int a[]=new int[n];
            int diff=Integer.MIN_VALUE;
            int c=0,f=0,one=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(i>0)
                {
                    int sub=Math.abs(a[i]-a[i-1]);
                    if(sub==1)
                        one++;
                    if(sub>diff)
                        diff=sub;
                }
            }
            for(int i=1;i<n;i++)
            {
                int sub=Math.abs(a[i]-a[i-1]);
                if(sub==0)
                {
                    f++;
                    if(i-2>=0)
                    {
                        if(a[i-2]!=a[i-1])
                            c++;
                    }
                    else if(i+1<=n-1)
                    {
                        if(a[i+1]!=a[i])
                            c++;
                    }
                }
            }
            long ans=Integer.MAX_VALUE;
            if(diff>=2)
            {
                out.printLine(0);
                out.flush();
                continue;
            }
            else
            {
                if(f>0)
                {
                    ans=Math.min(ans,Math.min((2*v),(u+v)));
                    if(c>0)
                        ans=Math.min(ans,u);
                }
                if(one>0)
                    ans=Math.min(ans,Math.min(u,v));
            }
            out.printLine(ans);
            out.flush();
        }
    }
}