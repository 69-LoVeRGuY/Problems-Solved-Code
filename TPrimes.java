import java.io.*;
import java.util.*;
import java.math.*;
public class TPrimes
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
    static boolean p[]=new boolean[1000001];
    static void sieve()
    {
        Arrays.fill(p,true);
        for(int q=2;q*q<1000001;q++)
        {
            if(p[q]==true)
            {
                for(int k=q*2;k<1000001;k+=q)
                    p[k]=false;
            }
        }
        
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        sieve();
        for(int i=0;i<n;i++)
        {
            long a=sc.nextLong();
            if(a==1)
            {
                System.out.println("NO");
                continue;
            }
            if(a==4)
            {
                System.out.println("YES");
                continue;
            }
            double s=Math.sqrt(a);
            double r=Math.floor(s);
            if(s-r!=0)
            {
                System.out.println("NO");
                continue;
            }
            if(s%2==0)
            {
                System.out.println("NO");
                continue;
            }
            if(p[(int)s])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}