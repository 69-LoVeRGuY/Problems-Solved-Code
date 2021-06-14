import java.io.*;
import java.util.*;
public class MultipleGame
{
    static void iDiffArray(int a[], int d[]) 
    { 
        int n = a.length; 
        d[0] = a[0]; 
        d[n] = 0; 
        for (int i = 1; i < n; i++) 
            d[i] = a[i] - a[i - 1]; 
    }
    static void update(int d[], int l, int r, int x)
    {
        d[l]+=x;
        d[r+1]-=x;
    }
    static void f(int a[], int d[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(i==0)
                a[i]=d[i];
            else
                a[i]=d[i]+a[i-1];
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int diff[]=new int[n+1];
            int ans=0;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            iDiffArray(a,diff);
            for(int i=0;i<q;i++)
            {
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                if(a[l]<=m)
                    update(diff,l,r,1);
            }
            f(a,diff);
            Arrays.sort(a);
            for(int i=a.length-1;i>=0;i--)
            {
                if(a[i]<=m)
                {
                    ans=a[i];
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}