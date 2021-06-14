import java.io.*;
import java.util.*;
public class PositivePrefix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n+1];
            int count=0,z=1;
            for(int i=1;i<=n;i++)
                a[i]=-i;
            while(z<=n && count<k)
            {
                a[z]*=-1;
                count++;
                z+=2;
            }
            if(z==n+2)
                z-=3;
            else if(z==n+1)
                z=n;
            while(z>1 && count<k)
            {
                a[z]*=-1;
                count++;
                z-=2;
            }
            for(int i=1;i<=n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}