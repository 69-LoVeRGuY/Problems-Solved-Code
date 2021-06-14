import java.io.*;
import java.util.*;
public class OneAndTwo
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
            if(s.contains("one")==false && s.contains("two")==false)
            {
                System.out.println(0);
                continue;
            }
            int c=0;
            List<Integer> l=new ArrayList();
            while(s.contains("one") || s.contains("two"))
            {
                if(s.contains("twone"))
                {
                    String g="";
                    int i=0;
                    while(i<s.length()-4)
                    {
                        if(s.charAt(i)=='t' && s.charAt(i+1)=='w' && s.charAt(i+2)=='o' && s.charAt(i+3)=='n' && s.charAt(i+4)=='e')
                        {
                            l.add(i+3);
                            c++;
                            g=g+s.substring(0,i+2)+" "+s.substring(i+3);
                            break;
                        }
                        else
                            i++;
                    }
                    s=g;
                }
                else if(s.contains("one"))
                {
                    String g="";
                    int i=0;
                    while(i<s.length()-2)
                    {
                        if(s.charAt(i)=='o' && s.charAt(i+1)=='n' && s.charAt(i+2)=='e')
                        {
                            l.add(i+2);
                            c++;
                            g=g+s.substring(0,i+1)+" "+s.substring(i+2);
                            break;
                        }
                        else
                            i++;
                    }
                    s=g;
                }
                else if(s.contains("two"))
                {
                    String g="";
                    int i=0;
                    while(i<s.length()-2)
                    {
                        if(s.charAt(i)=='t' && s.charAt(i+1)=='w' && s.charAt(i+2)=='o')
                        {
                            l.add(i+2);
                            c++;
                            g=g+s.substring(0,i+1)+" "+s.substring(i+2);
                            break;
                        }
                        else
                            i++;
                    }
                    s=g;
                }
            }
            System.out.println(c);
            for(int i=0;i<l.size();i++)
                System.out.print(l.get(i)+" ");
            System.out.println();
        }
    }
}