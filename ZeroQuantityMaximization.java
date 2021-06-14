import java.io.*;
import java.util.*;
public class ZeroQuantityMaximization
{
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int ans=0,extra=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                int r=gcd(a[i],b[i]);
                a[i]/=r;
                b[i]/=r;
                String s=String.valueOf(a[i])+" "+String.valueOf(b[i]);
                int val=map.getOrDefault(s,0);
                map.put(s,val+1);
            }
            else
            {
                if(b[i]==0)
                    extra++;
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>ans)
                ans=entry.getValue();
        }
        System.out.println((ans+extra));
    }
}