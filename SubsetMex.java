import java.io.*;
import java.util.*;
public class SubsetMex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[101];
            Arrays.fill(a,0);
            int f=-1,ans1=0,ans2=0;
            for(int i=0;i<n;i++)
            {
                int r=sc.nextInt();
                a[r]++;
                if(a[r]>=2)
                    f=0;
            }
            for(int i=0;i<=100;i++)
            {
                if(a[i]==0)
                {
                    ans1=i;
                    break;
                }
            }
            if(f==0)
            {
                for(int i=0;i<=100;i++)
                {
                    if(a[i]<2)
                    {
                        ans2=i;
                        break;
                    }
                }
            }
            System.out.println((ans1+ans2));
        }
    }
}    