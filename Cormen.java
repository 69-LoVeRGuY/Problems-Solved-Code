import java.io.*;
import java.util.*;
public class Cormen
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            if(a[i]+a[i+1]>=k)
                continue;
            else
            {
                int r=k-(a[i]+a[i+1]);
                a[i+1]+=r;
                total+=r;
            }
        }
        System.out.println(total);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}