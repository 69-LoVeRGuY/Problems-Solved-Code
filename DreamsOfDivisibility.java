import java.io.*;
import java.util.*;
public class DreamsOfDivisibility
{
    static long gcd(long a, long b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            long a[]=new long[n];
            int f=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                long s=gcd(a[i],k);
                long lcm=(a[i]*k)/s;
                long q=lcm/a[i];
                int pow=(int)Math.floor((Math.log(q)/Math.log(2)));
                int num=(int)Math.pow(2,pow);
                if(num!=q)
                    f=-1;
            }
            if(f==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}