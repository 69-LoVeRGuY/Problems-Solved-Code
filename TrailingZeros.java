import java.io.*;
import java.util.*;
import java.math.*;
public class TrailingZeros
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=5;
        long ans=0;
        while(num<=n)
        {
            int d=n/num;
            ans+=d;
            num*=5;
        }
        System.out.println(ans);
    }
}