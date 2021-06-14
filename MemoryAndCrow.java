import java.io.*;
import java.util.*;
public class MemoryAndCrow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        long ans[]=new long[n];
        long pos[]=new long[n];
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                pos[i]=a[i];
                ans[i]=a[i];
                continue;
            }
            ans[i]=a[i]+pos[i+1];
            pos[i]=ans[i]-pos[i+1];
        }
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");
        System.out.println();
    }
}