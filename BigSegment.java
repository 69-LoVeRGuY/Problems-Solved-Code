import java.io.*;
import java.util.*;
public class BigSegment
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        int l=0,r=0,f=0,p=-1;
        for(int i=0;i<n;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            if(l==0 && r==0)
            {
                l=a[i][0];
                r=a[i][1];
                p=i+1;
            }
            if(a[i][0]<=l && a[i][1]>=r)
            {
                l=a[i][0];
                r=a[i][1];
                p=i+1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i][0]>=l && a[i][1]<=r)
                continue;
            else
            {
                f=-1;
                break;
            }
        }
        if(f==-1)
            System.out.println(-1);
        else
            System.out.println(p);
    }
}