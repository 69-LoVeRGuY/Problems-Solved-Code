import java.io.*;
import java.util.*;
public class CalvinGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt()-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int ans=0;
        while(k<n-1)
        {
            int c=0;
            if(k+1<n)
            {
                if(a[k+1]>0)
                {
                    ans+=a[k+1];
                    k++;
                    continue;
                }
                else
                    c++;
            }
            if(k+2<n)
            {
                if(a[k+2]>0)
                {
                    ans+=a[k+2];
                    k+=2;
                    continue;
                }
                else
                    c++;
            }
            if(c==2)
                break;
        }
        while(k>0)
        {
            if(k-1>=0)
            {
                if(a[k-1]>0 || k-1==0)
                {
                    ans+=a[k-1];
                    k--;
                    continue;
                }
            }
            if(k-2>=0)
            {
                if(a[k-2]>0 || k-2==0)
                {
                    ans+=a[k-2];
                    k-=2;
                    continue;
                }
            }
            if(k-1>=0 && k-2>=0)
            {
                if(a[k-1]>=a[k-2])
                {
                    ans+=a[k-1];
                    k--;
                }
                else
                {
                    ans+=a[k-2];
                    k-=2;
                }
            }
        }
        System.out.println(ans);
    }
}