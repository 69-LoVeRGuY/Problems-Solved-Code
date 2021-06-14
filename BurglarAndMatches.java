import java.io.*;
import java.util.*;
public class BurglarAndMatches
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matches[]=new int[11];
        for(int i=0;i<m;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            matches[b]=matches[b]+a;
        }
        int count=0,c=10;
        long sum=0;
        while(count<n && c>0)
        {
            if(matches[c]>=(n-count))
            {
                sum=sum+((n-count)*c);
                count=n;
            }
            else
            {
                sum=sum+(matches[c]*c);
                count=count+matches[c];
            }
            c--;
        }
        System.out.println(sum);
    }
}