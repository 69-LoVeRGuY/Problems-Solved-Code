import java.io.*;
import java.util.*;
public class CacheHits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int b=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[m];
            int count=0,ll=0,ul=0;
            for(int i=0;i<m;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<m;i++)
            {
                if(i==0)
                {
                    count++;
                    int q=a[i]/b;
                    ll=b*q;
                    ul=ll+b-1;
                }
                else
                {
                    int q=a[i]/b;
                    if((b*q)<ll || (b*q)>ul)
                    {
                        count++;
                        ll=b*q;
                        ul=ll+b-1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}