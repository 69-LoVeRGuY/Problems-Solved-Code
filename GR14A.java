import java.io.*;
import java.util.*;
public class GR14A
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
            int x=sc.nextInt();
            int a[]=new int[n];
            int tsum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                tsum+=a[i];
            }
            if(tsum==x)
            {
                out.printLine("NO");
                out.flush();
                continue;
            }
            Arrays.sort(a);
            int flag=0,sum=0;
            out.printLine("YES");
            out.flush();
            if(a[n-1]==x)
            {
                out.print(a[n-2]+" ");
                for(int i=n-1;i>=0;i--)
                {
                        if(i==n-2)
                            continue;
                        out.print(a[i]+" ");
                }
                out.printLine();
                out.flush();
                continue;
            }
            if(a[n-1]>x || a[0]==x)
            {
                for(int i=n-1;i>=0;i--)
                    out.print(a[i]+" ");
                out.printLine();
                out.flush();
                continue;
            }
            for(int i=0;i<n;i++)
            {
                if((sum+a[i])!=x)
                    sum+=a[i];
                else
                    flag=a[i];
            }
            for(int i=0;i<n;i++)
                {
                    if(a[i]!=flag)
                        out.print(a[i]+" ");
                }
            if(flag!=0)
                out.printLine(flag);
            else
                out.printLine();
            out.flush();
        }
    }
}