import java.io.*;
import java.util.*;
public class AppleDivision
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        long tsum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
            tsum+=a[i];
        }
        long diff=Long.MAX_VALUE;
        for(int i=0;i<(1<<n);i++)
        {
            long sum=0;
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))>0)
                    sum+=a[j];
            }
            long sub=(long)Math.abs((tsum-sum)-sum);
            diff=(long)(Math.min(diff,sub));
        }
        System.out.println(diff);
    }
}