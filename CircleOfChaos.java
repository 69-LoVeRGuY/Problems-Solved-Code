import java.io.*;
import java.util.*;
public class CircleOfChaos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[m];
            for(int i=0;i<m;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int ans=0;
            for(int i=0;i<m;i++)
            {
                if(a[i]==n)
                    continue;
                if(a[i]<n)
                {
                    ans=ans+(n-a[i]);
                    n=a[i];
                    if(n==1)
                        break;
                }
                else if(a[i]>n && a[i]%n!=0)
                {
                    while(a[i]>n && a[i]%n!=0)
                    {
                        int q=a[i]/n;
                        int num=n*q;
                        int diff=a[i]-num;
                        ans+=diff;
                        n=n-diff;
                        if(n==1)
                            break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
 