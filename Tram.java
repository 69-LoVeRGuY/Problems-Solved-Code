import java.io.*;
import java.util.*;
public class Tram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total-a[i]+b[i];
            if(total>max)
                max=total;
        }
        System.out.println(max);
    }
}