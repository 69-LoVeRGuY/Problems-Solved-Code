import java.io.*;
import java.util.*;
public class PrimeSquare
{
    static boolean prime[]=new boolean[100001];
    static void sieve()
    {
        Arrays.fill(prime,true);
        for(int i=2;i*i<100000;i++)
        {
           if(prime[i])
           {
               for(int j=i*i;j<=100000;j+=i)
                   prime[j]=false;
           }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=0;
            if(n%2!=0)
                x=n+1;
            else if(n==2)
                x=4;
            else
                x=n;
            int num=x*(n-1);
            sieve();
            prime[1]=false;
            int z=0;
            for(int i=num+1;i<100000;i++)
            {
                if(prime[i]==true && prime[i-num]==false)
                {
                    z=i-num;
                    break;
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(j==i)
                        System.out.print(z+" ");
                    else
                        System.out.print(x+" ");
                }
                System.out.println();
            }
        }
    }
}
 