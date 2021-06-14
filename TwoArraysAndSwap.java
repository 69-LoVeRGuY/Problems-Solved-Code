import java.io.*;
import java.util.*;
public class TwoArraysAndSwap
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
            int k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                b[i]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            if(b[n-1]<=a[0] || k==0)
            {
                long sum=0;
                for(int i=0;i<n;i++)
                    sum+=a[i];
                System.out.println(sum);
                continue;
            }
            int c=0,a1=0,b1=n-1;
            while(c<k && a1<n && b1!=-1)
            {
                if(a[a1]<b[b1])
                {
                    a[a1]=b[b1];
                    c++;
                    a1++;
                    b1--;
                }
                else
                    break;
            }
            long sum=0;
            for(int i=0;i<n;i++)
                sum+=a[i];
            System.out.println(sum);
        }
    }
}