import java.io.*;
import java.util.*;
public class Sale
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int count=0,sum=0,i=0;
        while(count<m && a[i]<0)
        {
            sum=sum+Math.abs(a[i]);
            i++;
            count++;
            if(i==n)
                break;
        }
        System.out.println(sum);
    }
}