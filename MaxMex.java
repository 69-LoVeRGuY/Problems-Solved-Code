import java.io.*;
import java.util.*;
public class MaxMex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int c=0,f=0,h=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==m)
                    c++;
            }
            if(c>0)
            {
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<n-1;i++)
            {
                if(Math.abs(a[i+1]-a[i])>1)
                {
                    if((m>a[i] && m<a[i+1]) || (m<a[i] && m>a[i+1]))
                    {
                        if(a[i]+1==m)
                            f++;
                        else if(a[i]-1==m)
                            f++;
                        if(f>0)
                            break;
                    }
                    else
                        h=i+1;
                }
            }
            if(f>0 && h!=0)
                System.out.println(n-h);
            else if(f>0 && h==0)
                System.out.println(n);
            else if(f==0 && m-a[n-1]==1)    
                System.out.println(n-h);
            else if(a[0]-m==1)
                System.out.println(n);
            else
                System.out.println(-1);
        }
    }
}