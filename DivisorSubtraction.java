import java.io.*;
import java.util.*;
public class DivisorSubtraction
{
    static int factor(long n)
    {
        int result=0;
        for(long i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                result++;
                break;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int count=0;
        if(n%2==0)
        {
            System.out.println(n/2);
            System.exit(0);
        }
        if(factor(n)==0)
        {
            System.out.println(1);
            System.exit(0);
        }
        for(long i=3;;i+=2)
        {
            if(n%i==0)
            {
                while(n%2!=0)
                {
                    count++;
                    n-=i;
                }
                System.out.println((count+(n/2)));
                break;
            }
        }
    }
}