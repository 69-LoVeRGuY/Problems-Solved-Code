import java.io.*;
import java.util.*;
public class ACookieForYou
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long n=sc.nextLong();
            long m=sc.nextLong();
            if(a+b<n+m || (m>(long)Math.min(a,b)))
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}