import java.io.*;
import java.util.*;
public class InterestingSubarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int f=0;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<(n-1);i++)
            {
                if(Math.abs(a[i]-a[i+1])>=2)
                {
                    System.out.println("YES");
                    System.out.println((i+1)+" "+(i+2));
                    f++;
                    break;
                }
            }
            if(f==0)
                System.out.println("NO");
        }
    }
}