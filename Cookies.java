import java.io.*;
import java.util.*;
public class Cookies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            if((sum-a[i])%2==0)
                count++;
        }
        System.out.println(count);
    }
}