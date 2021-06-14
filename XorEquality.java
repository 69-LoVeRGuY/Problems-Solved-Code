import java.io.*;
import java.util.*;
import java.math.*;
public class XorEquality
{
    static long power(int a, int n, int mod)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return (a%mod);
        else
        {
            long r=power(a,n/2,mod);
            if(n%2==0)
                return ((r*r)%mod);
            else
                return ((r*r*a)%mod);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long ans=power(2,n-1,1000000007);
            System.out.println(ans);
        }
    }
}