import java.io.*;
import java.util.*;
public class sieve
{
    static boolean prime[]=new boolean[1000001];
    static long n=1000000;
    static void Sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
    }
    public static void main(String args[])
    {
        Sieve();
        for(int i=2;i<=1000000;i++)
        {
            if(prime[i]==true)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}