import java.io.*;
import java.util.*;
import java.math.*;
public class CuteChefGift
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            BigInteger b=new BigInteger("1");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                BigInteger r=new BigInteger(String.valueOf(a[i]));
                b=b.multiply(r);
            }
            int count=0;
            BigInteger x=new BigInteger("1");
            for(int i=0;i<n;i++)
            {
                BigInteger s=new BigInteger(String.valueOf(a[i]));
                x=x.multiply(s);
                b=b.divide(s);
                count++;
                if(String.valueOf(b.gcd(x)).equals("1"))
                {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}