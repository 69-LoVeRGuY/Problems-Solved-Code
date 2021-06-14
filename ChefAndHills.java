import java.io.*;
import java.util.*;
public class ChefAndHills
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int range=a[n-1]-a[0]+1;
            int lm=0,rm=0;
            if(range<k)
            {
                int left=k-range;
                if(left%2==0)
                {
                    lm=a[0]-(left/2);
                    rm=a[n-1]-(left/2);
                }
                else
                {
                    if(n%2==1)
                    {
                        lm=a[0]-((left/2)+1);
                        rm=a[n-1]-(left-((left/2)+1));
                    }
                    else
                    {
                        lm=a[0]-((left/2)+1);
                        rm=a[n-1]-(left-((left/2)+1));
                    }
                }
            }
            else
            {
                int mid=(a[n-1]+a[0])/2;
                if(k%2==1)
                {
                    lm=mid-((k-1)/2);
                    rm=mid+((k-1)/2);
                }
                else
                {
                    lm=mid-(((k-1)/2)+1);
                    rm=mid+((k-1)-(((k-1)/2)+1));
                }
            }
            int ans=0;
            for(int i=0;i<n;i++)
                ans+=Math.max((Math.abs(a[i]-lm)),(Math.abs(a[i]-rm)));
            System.out.println(ans);
        }
    }
}