import java.io.*;
import java.util.*;
public class PrimeGame
{
    static boolean prime[]=new boolean[1000010];
    static List<Integer> list=new ArrayList();
    static void sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<1000010;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<1000010;j+=i)
                    prime[j]=false;
            }
        }
        for(int i=0;i<1000010;i++)
        {
            if(prime[i])
                list.add(i);
        }
    }
    static int LowerBound(Integer a[], int x)
    {
         int l=-1,r=a.length;
          while(l+1<r) {
            int m=(l+r)>>>1;
            if(a[m]>=x) r=m;
            else l=m;
          }
          return r-1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sieve();
        Integer a[]=new Integer[list.size()];
        a=list.toArray(a);
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=LowerBound(a,x);
            
            int mujra = 0;
            
            if(a[r]>x)
                mujra = r-1;
            else    
                mujra = r;
                
            mujra++;
            
            if(y>=mujra)
                System.out.println("Chef");
            else
                System.out.println("Divyam");
        }
    }
}