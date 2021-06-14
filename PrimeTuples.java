import java.io.*;
import java.util.*;
public class PrimeTuples
{
    static boolean prime[]=new boolean[1000001];
    static int ans[]=new int[1000001];
    static int n=1000000;
    static void sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for (int p = 2; p * p <= n; p++) 
        {
            if (prime[p] == true) 
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i=2;i<=1000000;i++)
        {
            if(prime[i]==true && prime[i-2]==true)
                ans[i]=ans[i-1]+1;
            else
                ans[i]=ans[i-1];
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sieve();
        while(t-->0)
        {
            int n=sc.nextInt();
            System.out.println(ans[n]);
        }
    }
}