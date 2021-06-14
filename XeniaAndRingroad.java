import java.io.*;
import java.util.*;
public class XeniaAndRingroad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m];
        int p=1;
        long ans=0;
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<p)
                ans+=n+a[i]-p;
            else
                ans+=a[i]-p;
            p=a[i];
        }
        System.out.println(ans);
    }
}