import java.io.*;
import java.util.*;
public class MinimumJumpsToDestination
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int jump[]=new int[n];
        if(a[n-1]==0)
        {
            System.out.println(0);
            System.exit(0);
        }
        if(a[0]==0)
        {
            System.out.println("INFINITY");
            System.exit(0);
        }
        jump[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]==0)
                jump[i]=0;
            else
            {
                int f=i+1,c=0;
                int min=Integer.MAX_VALUE;
                while(f<=i+a[i] && f<n)
                {
                    if(jump[f]==0 && f!=n-1)
                    {
                        f++;
                        continue;
                    }
                    else
                        c=jump[f];
                    if(c<min)
                        min=c;
                    f++;
                }
                if(min==Integer.MAX_VALUE)
                    jump[i]=0;
                else
                    jump[i]=min+1;
            }
        }
        System.out.println(jump[0]);
    }
}