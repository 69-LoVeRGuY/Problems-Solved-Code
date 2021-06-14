import java.io.*;
import java.util.*;
public class Bets
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
      
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
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
        int a[][]=new int[m][4];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int profit=0;
        for(int i=1;i<=n;i++)
        {
            int min=Integer.MAX_VALUE,minp=-1;
            for(int j=0;j<m;j++)
            {
                if(i==a[j][0] || i==a[j][1] || (i>a[j][0] && i<a[j][1]))
                {
                    if(a[j][2]<min)
                    {
                        minp=j;
                        min=a[j][2];
                    }
                }
            }
            if(minp!=-1)
                profit+=a[minp][3];
        }
        System.out.println(profit);
    }
}