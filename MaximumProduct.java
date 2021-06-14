import java.io.*;
import java.util.*;
public class MaximumProduct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            Arrays.sort(a);
            if(n==5)
            {
                System.out.println(a[0]*a[1]*a[2]*a[3]*a[4]);
                continue;
            }
            int s=0,e=n-1;
            long r[]=new long[5];
            r[0]=a[e]*a[e-1]*a[e-2]*a[e-3]*a[e-4];
            r[1]=a[s]*a[s+1]*a[s+2]*a[s+3]*a[e];
            r[2]=a[s]*a[s+1]*a[e]*a[e-1]*a[e-2];
            r[3]=a[s]*a[s+1]*a[s+2]*a[s+3]*a[s+4];
            r[4]=a[s]*a[s+1]*a[s+2]*a[e]*a[e-1];
            Arrays.sort(r);
            System.out.println(r[4]);
        }
    }
}
 