import java.io.*;
import java.util.*;
public class TernaryString
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
            HashMap<Character,Integer> hm=new HashMap();
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<s.length();i++)
            {
                hm.put(s.charAt(i),i);
                if(hm.size()==3)
                {
                    int max=Math.max(Math.max(hm.get('1'),hm.get('2')),hm.get('3'));
                    int min=Math.min(Math.min(hm.get('1'),hm.get('2')),hm.get('3'));
                    int diff=max-min;
                    ans=Math.min(ans,diff);
                }
            }
            if(ans!=Integer.MAX_VALUE)
                System.out.println(ans+1);
            else
                System.out.println(0);
        }
    }
}