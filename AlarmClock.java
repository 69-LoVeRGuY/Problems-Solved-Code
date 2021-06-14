import java.io.*;
import java.util.*;
public class AlarmClock
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(d>=c && b<a)
            {
                System.out.println(-1);
                continue;
            }
            if(b>=a)
            {
                System.out.println(b);
                continue;
            }
            long na=b;
            double g=c-d;
            double e=(a-b)/g;
            double f=Math.floor(e);
            if(e==f)
            {
                long x=(long)e;
                na=na+(c*x);
            }
            else
            {
                long x=(long)f;
                x++;
                na=na+(c*x);
            }
            System.out.println(na);
        }
    }
}