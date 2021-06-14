import java.io.*;
import java.util.*;
public class SpaceArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n+1];
            long arr[]=new long[n+1];
            long sum=0;
            for(int i=1;i<=n;i++)
            {
                a[i]=sc.nextInt();
                arr[i]=(long)i;
                sum=sum+arr[i]-a[i];
            }
            if(sum%2==0 || sum<0)
                System.out.println("Second");
            else
                System.out.println("First");
        }
    }
}