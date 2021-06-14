import java.io.*;
import java.util.*;
public class CF722B
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
            int a[]=new int[n];
            int neg=0,zero=0,pos=Integer.MAX_VALUE;
            List<Integer> minus=new ArrayList();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            List<Integer> ans=new ArrayList();
            int count=0,max=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++)
            {
                int diff=a[i+1]-a[i];
                max=Math.min(max,diff);
                if(diff>=a[i+1] && max>=a[i+1])
                {
                    if(i==0)
                    {
                        ans.add(a[i]);
                        ans.add(a[i+1]);
                    }
                    else
                        ans.add(a[i+1]);
                }
            }
            if(ans.size()==0)
                out.printLine(1);
            else
                out.printLine(ans.size());
            out.flush();
        }
    }
}