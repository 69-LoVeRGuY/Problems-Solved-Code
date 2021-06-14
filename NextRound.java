import java.io.*;
import java.util.*;
public class NextRound
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i>=k && a[i]==a[k-1] && a[k-1]!=0)
                count++;
        }
        for(int i=0;i<k;i++)
        {
            if(a[i]!=0)
                count++;
        }
        System.out.println(count);
    }
}