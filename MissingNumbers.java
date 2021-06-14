import java.io.*;
import java.util.*;
public class MissingNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long f=(n*(n+1))/2;
        long sum=0;
        for(int i=0;i<n-1;i++)
        {
            long a=sc.nextLong();
            sum+=a;
        }
        System.out.println((f-sum));
    }
}