import java.io.*;
import java.util.*;
public class Game23
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
        int m=sc.nextInt();
        double s=m/(double)n;
        double r=Math.floor(s);
        int a=m/n;
        if(m==n)
        {
            System.out.println(0);
            System.exit(0);
        }
        if(s!=r || (a%2!=0 && a%3!=0))
        {
            System.out.println(-1);
            System.exit(0);
        }
        int count=0;
        while(a%3==0)
        {
            count++;
            a=a/3;
        }
        int power=(int)Math.floor((Math.log(a)/Math.log(2)));
        if(Math.pow(2,power)==a)
            System.out.println(count+power);
        else
            System.out.println(-1);
    }
}