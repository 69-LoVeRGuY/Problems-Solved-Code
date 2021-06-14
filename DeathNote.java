import java.io.*;
import java.util.*;
public class DeathNote
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        long sum=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        long prev=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            long q=sum/m;
            System.out.print((q-prev)+" ");
            prev=q;
        }
        System.out.println();
    }
}