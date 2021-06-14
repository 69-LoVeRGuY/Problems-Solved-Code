import java.io.*;
import java.util.*;
public class CatCycle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long ans=0;
            if(n%2==0)
                ans=k;
            else
            {
                long h=n/2;
                if(k<=h)
                    ans=k;
                else
                    ans=k+(((k-(h+1))/h)+1);
            }
            if(ans>n)
            {
                if(ans%n==0)
                    ans=n;
                else
                    ans=ans%n;
            }
            System.out.println(ans);
        }
    }
}