import java.io.*;
import java.util.*;
public class JonnyAndAncientComputer
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
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b)
                System.out.println(0);
            else
            {
                if(Math.max(a,b)%Math.min(a,b)==0)
                {
                    long c=((long)Math.max(a,b))/((long)Math.min(a,b));
                    if(c%2!=0)
                        System.out.println(-1);
                    else
                    {
                        int f=0;
                        while(c!=1)
                        {
                            if(c%8==0)
                            {
                                c=c/8;
                                f++;
                            }
                            else if(c%4==0)
                            {
                                c=c/4;
                                f++;
                            }
                            else if(c%2==0)
                            {
                                c=c/2;
                                f++;
                            }
                        }
                        System.out.println(f);
                    }
                }
                else
                    System.out.println(-1);
            }
        }
    }
}