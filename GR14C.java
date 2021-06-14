import java.io.*;
import java.util.*;
public class GR14C
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
            int m=sc.nextInt();
            long x=sc.nextLong();
            long h[]=new long[n];
            long th[]=new long[m];
            int ans[]=new int[n];
            for(int i=0;i<n;i++)
                h[i]=sc.nextLong();
            Arrays.sort(h);
            int c=0,flag=0,g=0,pura=n%m;
            for(int i=0;i<n;i++)
            {
                int r=c/m;
                if(r%2==0 || (pura!=0 && n-i<m))
                    th[i-(r*m)]+=h[i];
                else
                    th[m-(i-((r*m)-1))]+=h[i];
                c++;
            }
            for(int i=1;i<m;i++)
            {
                if(Math.abs(th[i]-th[i-1])>x)
                {
                    flag=-1;
                    break;
                }
            }
            if(flag==-1)
            {
                out.printLine("NO");
                out.flush();
                continue;
            }
            out.printLine("YES");
            out.flush();
            for(int i=0;i<n;i++)
            {
                int r=g/m;
                if(r%2==0)
                    ans[i]=i-(r*m)+1;
                else
                    ans[i]=m-(i-((r*m)-1))+1;
                g++;
                out.print(ans[i]+" ");
            }
            out.printLine();
            out.flush();
        }
    }
}