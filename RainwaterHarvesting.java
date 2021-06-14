import java.io.*;
import java.util.*;
public class RainwaterHarvesting
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        int pre[]=new int[n];
        int post[]=new int[n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i>0)
            {
                if(a[i]>pre[i-1])
                    pre[i]=a[i];
                else
                    pre[i]=pre[i-1];
            }
            else
                pre[i]=a[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            if(i<n-1)
            {
                if(a[i]>post[i+1])
                    post[i]=a[i];
                else
                    post[i]=post[i+1];
            }
            else
                post[i]=a[i];
        }
        for(int i=1;i<n;i++)
        {
            int f=Math.min(pre[i],post[i]);
            ans=ans+f-a[i];
        }
        System.out.println(ans);
    }
}