import java.io.*;
import java.util.*;
public class Kefa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n==1)
        {
            System.out.println(1);
            System.exit(0);
        }
        int max=0,c=1;
        for(int i=0;i<n-1;i++)
        {
           if(a[i+1]>=a[i])
                c++;
           else
           {
               if(c>max)
                    max=c;
               c=1;
           }
        }
        if(c>max)
            max=c;
        System.out.println(max);
    }
}