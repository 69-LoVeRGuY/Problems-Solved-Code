import java.io.*;
import java.util.*;
public class ECF109A
{
    static int gcd(int a, int b)
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
            int k=sc.nextInt();
            int d=100;
            while(gcd(k,d)!=1)
            {
                int s=gcd(k,d);
                k/=s;
                d/=s;
            }
            System.out.println(d);
        }
    }
}