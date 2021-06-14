import java.io.*;
import java.util.*;
public class SociallyDistancedSubsequence
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
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int j=0,c=0,xp=j,yp=j+1,zp=j+2;
            while(xp<a.length-2)
            {
                int x=a[xp],y=a[yp],z=a[zp];
                while(x==-1 && xp<a.length-2)
                {
                    x=a[xp+1];
                    xp=xp+1;
                    y=a[xp+1];
                    yp=xp+1;
                    z=a[xp+2];
                    zp=xp+2;
                }
                while(y==-1 && yp<a.length-1)
                {
                    y=a[yp+1];
                    yp=yp+1;
                    z=a[yp+1];
                    zp=yp+1;
                }
                if(((x<y)&&(y<z))||((x>y)&&(y>z)))
                {
                    a[yp]=-1;
                    c++;
                }
                else
                {
                    xp++;
                    yp=xp+1;
                    zp=xp+2;
                }
                if(z==a[a.length-1])
                    break;
            }
            System.out.println(a.length-c);
            for(int i=0;i<n;i++)
            {
                if(a[i]!=-1)
                    System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}