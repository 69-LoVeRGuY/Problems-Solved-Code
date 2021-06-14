import java.io.*;
import java.util.*;
public class LCM
{
    static int factors(long n)
    {
        int r=0;
        for(long i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                r++;
                if((n/i)!=i)
                    r++;
            }
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int f=factors(n);
        System.out.println(f);
    }
}