import java.io.*;
import java.util.*;
public class KshushaAndArray
{
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    static int findgcd(Integer a[])
    {
        int result=0;
        for(int i=0;i<a.length;i++)
        {
            result=gcd(result,a[i]);
            if(result==1)
                return 1;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        int one=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==1)
                one++;
        }
        if(one>0)
        {
            System.out.println(1);
            System.exit(0);
        }
        Arrays.sort(a);
        int s=findgcd(a);
        if(s==a[0])
            System.out.println(a[0]);
        else
            System.out.println(-1);
    }
}