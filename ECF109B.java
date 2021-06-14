import java.io.*;
import java.util.*;
public class ECF109B
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
                a[i]=sc.nextInt();
            int copy[]=a.clone();
            Arrays.sort(copy);
            int f=0;
            if(copy[0]==a[n-1] && copy[n-1]==a[0])
            {
                System.out.println(3);
                continue;
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]!=copy[i])
                {
                    f=-1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(0);
                continue;
            }
            int d[]=new int[n-1];
            int e[]=new int[n];
            for(int i=0;i<n-1;i++)
            {
                d[i]=a[i];
                if(i>0)
                    e[i]=a[i];
            }
            e[0]=0;
            e[n-1]=a[n-1];
            Arrays.sort(d);
            Arrays.sort(e);
            f=0;
            for(int i=0;i<n-1;i++)
            {
                if(d[i]!=copy[i])
                {
                    f=-1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(1);
                continue;
            }
            f=0;
            for(int i=1;i<n;i++)
            {
                if(e[i]!=copy[i])
                {
                    f=-1;
                    break;
                }
            }
            if(f==0)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}