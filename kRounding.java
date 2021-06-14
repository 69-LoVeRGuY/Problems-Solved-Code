import java.io.*;
import java.util.*;
public class kRounding
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
        long n=sc.nextLong();
        long k=sc.nextLong();
        long z=(long)Math.pow(10,k);
        long p=z*n;
        long lcm=p/gcd(n,z);
        System.out.println(lcm);
    }
}