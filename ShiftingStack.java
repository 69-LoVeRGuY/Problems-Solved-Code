import java.io.*;
import java.util.*;
public class ShiftingStack
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
            int f=0,d=0;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]>=f)
                {
                    a[i+1]+=a[i]-f;
                    f++;
                }
                else
                {
                    d=-1;
                    break;
                }
            }
            if(a[n-1]<f)
                d=-1;
            if(d==-1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}