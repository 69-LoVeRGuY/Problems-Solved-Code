import java.io.*;
import java.util.*;
public class LongJumps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            long b[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]+i<n)
                    b[a[i]+i]=Math.max(b[a[i]+i],(b[i]+a[a[i]+i]));
            }
            Arrays.sort(b);
            System.out.println(b[n-1]);
        }
    }
}