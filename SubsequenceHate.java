import java.io.*;
import java.util.*;
public class SubsequenceHate
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
            String s=sc.next();
            if(s.length()<3)
            {
                System.out.println(0);
                continue;
            }
            int z=0,on=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    on++;
                else
                    z++;
            }
            if(on==1)
            {
                if(s.charAt(0)=='1' || s.charAt(s.length()-1)=='1')
                    System.out.println(0);
                else
                    System.out.println(1);
                continue;
            }
            if(z==1)
            {
                if(s.charAt(0)=='0' || s.charAt(s.length()-1)=='0')
                    System.out.println(0);
                else
                    System.out.println(1);
                continue;
            }
            if(z<on)
            {
                if(s.charAt(0)=='0' || s.charAt(s.length()-1)=='0')
                    System.out.println(z-1);
                else
                    System.out.println(z);
            }
            else if(on<z)
            {
                if(s.charAt(0)=='1' || s.charAt(s.length()-1)=='1')
                    System.out.println(on-1);
                else
                    System.out.println(on);
            }
            else
            {
                if(s.charAt(0)=='0' || s.charAt(s.length()-1)=='0')
                    System.out.println(z-1);
                else if(s.charAt(0)=='1' || s.charAt(s.length()-1)=='1')
                    System.out.println(on-1);
                else
                    System.out.println(on);
            }
        }
    }
}