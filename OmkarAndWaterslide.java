import java.io.*;
import java.util.*;
public class OmkarAndWaterslide
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            long count=0L;
            int compare=-1,toequal=-1;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            if(n==1)
            {
                System.out.println(0);
                continue;
            }
            for(int i=1;i<n;i++)
            {
                if(compare==-1 && a[i]<a[i-1])
                {
                    count=count+(a[i-1]-a[i]);
                    compare=a[i];
                    toequal=a[i-1];
                    continue;
                }
                if(a[i]<=a[i-1] && compare>-1)
                {
                    count=count+(compare-a[i]);
                    compare=a[i];
                }
                else if(a[i]>a[i-1] && a[i]<toequal)
                {
                    compare=a[i];
                }
                else
                {
                    toequal=a[i];
                    compare=a[i];
                }
            }
            System.out.println(count);
        }
    }
}