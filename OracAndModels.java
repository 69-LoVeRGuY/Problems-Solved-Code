import java.io.*;
import java.util.*;
public class OracAndModels
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
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=sc.nextInt();
            if(n==1)
            {
                System.out.println(1);
                continue;
            }
            List<Integer> al=new ArrayList();
            for(int i=2;i<=n/2;i++)
            {
                int c=0,g=i;
                if(a[i]>a[1])
                    c=2;
                else
                    c=1;
                for(int j=2;;j++)
                {
                    int f=c;
                    if(i*j<=n)
                    {
                        if(a[i*j]>a[g] && (i*j)%g==0)
                        {
                            f++;
                            g=i*j;
                            for(int k=i*j*2;k<=n;k=k+g)
                            {
                                if(a[k]>a[g] && k%g==0)
                                {
                                    f++;
                                    g=k;
                                }
                            }
                            al.add(f);
                        }
                    }
                    else
                        break;
                }
            }
            Collections.sort(al);
            if(al.size()!=0)
                System.out.println(al.get(al.size()-1));
            else
                System.out.println(1);
        }
    }
}