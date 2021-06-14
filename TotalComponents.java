import java.io.*;
import java.util.*;
public class TotalComponents
{
    static boolean prime[]=new boolean[10000010];
    static void sieve()
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<10000010;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<10000010;j+=i)
                    prime[j]=false;
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		   Scanner sc=new Scanner(System.in);
		   int t=sc.nextInt();
		   sieve();
		   while(t-->0)
		   {
		       int n=sc.nextInt();
		       int ans=0;
		       if(n==2 || n==3)
		       {
		           ans=-1;
		       }
		       for(int i=((n/2)+1);i<=n;i++)
		       {
		           if(prime[i]==true)
		                ans++;
		       }
		       System.out.println((ans+1));
		   }
	}
}