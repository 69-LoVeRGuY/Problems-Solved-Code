import java.io.*;
import java.util.*;
public class IPCCertificate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[][]=new int[n][k];
        int q[]=new int[n];
        long sum[]=new long[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                a[i][j]=sc.nextInt();
                sum[i]+=a[i][j];
            }
            q[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(sum[i]>=m && q[i]<=10)
               count++;
        }
        System.out.println(count);
    }
}