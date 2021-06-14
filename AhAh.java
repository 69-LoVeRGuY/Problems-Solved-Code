import java.io.*;
import java.util.*;
public class AhAh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                if(i%2==0 || b==0)
                    a[i]=b;
                else
                    a[i]=-b;
            }
            int sum=0;
            for(int i=0;i<n;i++)
                sum=sum+a[i];
            if(sum>0)
            {
                System.out.println(n-sum);
                int f=0;
                for(int i=0;i<n;i++)
                {
                    if(a[i]>0 && f<sum)
                        f++;
                    else
                    {
                        if(a[i]<0)
                            System.out.print(1+" ");
                        else
                            System.out.print(a[i]+" ");
                    }
                }
                System.out.println();
            }
            else if(sum<0)
            {
                System.out.println(n-Math.abs(sum));
                int f=0;
                for(int i=0;i<n;i++)
                {
                    if(a[i]<0 && f<(Math.abs(sum)))
                        f++;
                    else
                    {
                        if(a[i]<0)
                            System.out.print(1+" ");
                        else
                            System.out.print(a[i]+" ");
                    }
                }
                System.out.println();
            }
            else
            {
                System.out.println(n);
                for(int i=0;i<n;i++)
                {
                    if(a[i]<0)
                        System.out.print(1+" ");
                    else
                        System.out.print(a[i]+" ");
                }
                System.out.println();
            }
        }
    }
}