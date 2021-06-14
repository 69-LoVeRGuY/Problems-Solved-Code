import java.io.*;
import java.util.*;
public class ArtonAndPotions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int s=sc.nextInt();
        int a[]=new int[m];
        int max=0,f=-1,r=2000000000,result=0,left,q1=0,q2=0;
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
            if(b[i]>s)
                q1++;
        }
        int c[]=new int[k];
        for(int i=0;i<k;i++)
        {
            c[i]=sc.nextInt();
        }
        int d[]=new int[k];
        for(int i=0;i<k;i++)
        {
            d[i]=sc.nextInt();
            if(d[i]<=s)
            {
                max=d[i];
                f=i;
            }
            else if(d[i]>s)
                q2++;
        }
        if(q1==m && q2==k)
        {
            System.out.println(n*x);
            System.exit(0);
        }
        if(f!=-1)
            left=n-c[f];
        else
            left=n;
        if(left==0)
        {
            System.out.println(0);
            System.exit(0);
        }
        int q=s-max;
        for(int i=0;i<m;i++)
        {
            if(b[i]<=q && a[i]<r)
                r=a[i];
        }
        if(r!=2000000000)
            System.out.println(left*r);
        else
        {
            int y=left*x;
            for(int i=0;i<m;i++)
            {
                if(b[i]<=s && a[i]<r)
                    r=a[i];
            }
            if(Math.min(y,(n*r))==y)
                System.out.println(y);
            else
                System.out.println(n*r);
        }
    }
}