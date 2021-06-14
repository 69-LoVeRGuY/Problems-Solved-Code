import java.io.*;
import java.util.*;
public class CF706B
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
            int k=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> set=new HashSet();
            HashSet<Integer> small=new HashSet();
            int mex=-1,max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                set.add(a[i]);
                if(a[i]<n)
                    small.add(a[i]);
                if(a[i]>max)
                    max=a[i];
            }
            for(int i=0;i<n;i++)
            {
                if(small.contains(i)==false)
                {
                    mex=i;
                    break;
                }
            }
            if(mex==-1)
            {
                out.printLine((set.size()+k));
                out.flush();
                continue;
            }
            int num=mex+max;
            int avg=num/2;
            if(num%2==1)
                avg++;
            if(set.contains(avg)==false && k>0)
                out.printLine((set.size()+1));
            else
                out.printLine(set.size());
            out.flush();
        }
    }
}