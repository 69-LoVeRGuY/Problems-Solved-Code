import java.io.*;
import java.util.*;
public class StickLength
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int mid=0;
        long ans=0;
        if(n%2==0)
            mid=(a[n/2]+a[(n/2)-1])/2;
        else
            mid=a[n/2];
        for(int i=0;i<n;i++)
        {
            ans+=(long)Math.abs(a[i]-mid);
        }
        System.out.println(ans);
    }
}