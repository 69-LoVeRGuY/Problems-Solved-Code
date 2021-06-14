import java.io.*;
import java.util.*;
public class Permutations
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
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int ans[]=new int[n+1];
        for(int i=1;i<=n;i++)
            a[i]=i;
        int s=1,e=n,c=0;
        if(n==3 || n==2)
        {
            out.printLine("NO SOLUTION");
            out.flush();
            System.exit(0);
        }
        for(int i=1;i<=n;i++)
        {
            if(c%2==0)
            {
                ans[s]=a[i];
                s++;
            }
            else
            {
                ans[e]=a[i];
                e--;
            }
            c++;
        }
        if(n%2==0)
        {
            int temp=ans[n/2];
            ans[n/2]=ans[(n/2)-1];
            ans[(n/2)-1]=temp;
        }
        else
        {
            if(n>1)
            {
                int temp=ans[(n/2)+2];
                ans[(n/2)+2]=ans[(n/2)+3];
                ans[(n/2)+3]=temp;
            }
        }
        for(int i=1;i<=n;i++)
            out.print(ans[i]+" ");
        out.printLine();
        out.flush();
    }
}