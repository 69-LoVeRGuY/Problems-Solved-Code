import java.io.*;
import java.util.*;
public class KSubarrays
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
            long a[]=new long[n];
            int neg=0;
            long min=Long.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                if(a[i]<0)
                    neg++;
                if(a[i]<min)
                    min=a[i];
            }
            if(k==1)
            {
                long max_so_far=Long.MIN_VALUE,max_ending_here=0;
                for(int i=0;i<n;i++)
                {
                    max_ending_here+=a[i];
                    if(max_ending_here>max_so_far)
                        max_so_far=max_ending_here;
                    if(max_ending_here<0)
                        max_ending_here=0;
                }
                out.printLine(max_so_far);
                out.flush();
            }
            else if(k==2)
            {
                if(neg==0)
                {
                    long sum=0;
                    for(int i=0;i<n;i++)
                        sum+=a[i];
                    sum-=min;
                    sum*=2;
                    sum+=min;
                    out.printLine(sum);
                    out.flush();
                }
                else
                {
                    long max_ending_here=0,max_so_far=Long.MIN_VALUE,second_max=Long.MIN_VALUE+1,be=-1,sbe=-1;
                    for(int i=0;i<n;i++)
                    {
                        max_ending_here+=a[i];
                        if(max_ending_here>max_so_far)
                        {
                            second_max=max_so_far;
                            max_so_far=max_ending_here;
                            sbe=be;
                            be=i;
                        }
                        if(max_ending_here>second_max)
                        {
                            second_max=max_ending_here;
                            sbe=i;
                        }
                        if(max_ending_here<0)
                            max_ending_here=0;
                    }
                    long sum=0;
                    if(sbe>be)
                        sum=(2*second_max)+max_so_far;
                    else
                        sum=(2*max_so_far)+second_max;
                    out.printLine(sum);
                    out.flush();
                }
            }
        }
    }
}