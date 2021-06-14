import java.io.*;
import java.util.*;
public class IncreasingArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        long num=0,r=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
            if(i>0)
            {
                if(a[i]<a[i-1])
                {
                    num+=a[i-1]-a[i];
                    a[i]=a[i-1];
                }
            }
        }
        System.out.println(num);
    }
}