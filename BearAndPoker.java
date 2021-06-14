import java.io.*;
import java.util.*;
public class BearAndPoker
{
    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return(gcd(b%a,a));
    }
    static int findgcd(int a[])
    {
        int result=a[0];
        for(int i=1;i<a.length;i++)
        {
            result=gcd(a[i],result);
            if(result==1)
                return 1;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int result=findgcd(a);
        for(int i=0;i<n;i++)
        {
            int r=a[i]/result;
            while(r%2==0 || r%3==0)
            {
                if(r%2==0)
                    r=r/2;
                else if(r%3==0)
                    r=r/3;
            }
            if(r==1)
                f++;
        }
        if(f==n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}