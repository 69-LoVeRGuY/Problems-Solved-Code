import java.io.*;
import java.util.*;
public class OmkarAndInfinityClock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            int a[]=new int[n];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>max)
                    max=a[i];
            }
            int ans[]=new int[n];
            int emax=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                ans[i]=max-a[i];
                if(ans[i]>emax)
                    emax=ans[i];
            }
            if(k==1)
            {
                for(int i=0;i<n;i++)
                    System.out.print(ans[i]+" ");
                System.out.println();
                continue;
            }
            else
            {
                int odd[]=new int[n];
                int even[]=new int[n];
                int omax=Integer.MIN_VALUE;
                for(int i=0;i<n;i++)
                {
                    even[i]=emax-ans[i];
                    if(even[i]>omax)
                        omax=even[i];
                }
                if(k%2==0)
                {
                    for(int i=0;i<n;i++)
                        System.out.print(even[i]+" ");
                    System.out.println();
                    continue;
                }
                for(int i=0;i<n;i++)
                {
                    odd[i]=omax-even[i];
                    System.out.print(odd[i]+" ");
                }
                System.out.println();
            }
        }
    }
}