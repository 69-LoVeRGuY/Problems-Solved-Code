import java.io.*;
import java.util.*;
public class Chocolates
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
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        long sum=0;
        if(n==1)
        {
            System.out.println(a[0]);
            System.exit(0);
        }
        for(int i=n-1;i>=1;i--)
        {
            if(a[i-1]<a[i])
            {
                sum+=a[i];
                if(i-1==0)
                    sum+=a[i-1];
            }
            else if(a[i-1]>a[i])
            {
                sum+=a[i];
                a[i-1]=a[i]-1;
                if(a[i-1]<0)
                    a[i-1]=0;
                if(i-1==0)
                    sum+=a[i-1];
            }
            else if(a[i]==a[i-1])
            {
                sum+=a[i];
                a[i-1]=a[i]-1;
                if(i-1==0)
                    sum+=a[i-1];
            }
        }
        System.out.println(sum);
    }
}