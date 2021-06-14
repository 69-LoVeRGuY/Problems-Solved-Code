import java.io.*;
import java.util.*;
public class XXXXX
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            int c=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%x==0)
                    c++;
                sum=sum+a[i];
            }
            if(sum%x!=0)
            {
                System.out.println(n);
                continue;
            }
            if(c==n)
            {
                System.out.println(-1);
                continue;
            }
            int start=-1,end=-1;
            for(int i=0;i<n;i++)
            {
                if(a[i]%x!=0 && start==-1)
                    start=i;
                if(a[n-1-i]%x!=0 && end==-1)
                    end=n-1-i;
                if(start!=-1 && end!=-1)
                    break;
            }
            if(start==end)
            {
                System.out.println(start+1);
                continue;
            }
            long sum1=sum, sum2=sum;
            for(int i=0;i<start;i++)
                sum1-=a[i];
            for(int i=end+1;i<n;i++)
                sum2-=a[i];
            if(sum1%x!=0 && sum2%x!=0 && (n-start)>=(end+1))
                System.out.println(n-start);
            else if(sum1%x!=0 && sum2%x!=0 && (n-start)<(end+1))
                System.out.println(end+1);
            else if(sum1%x==0 && sum2%x==0)
            {
                if(n-start-1>=end)
                    System.out.println(n-start-1);
                else
                    System.out.println(end);
            }
            else if(sum1%x!=0)
                System.out.println(n-start);
            else if(sum2%x!=0)
                System.out.println(end+1);
            else
                System.out.println(end-start+1);
        }
    }
}