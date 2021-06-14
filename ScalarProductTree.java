import java.io.*;
import java.util.*;
public class ScalarProductTree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long mod=(long)Math.pow(2,32);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int w[]=new int[n];
        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=1;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            map.put(b,a);
        }
        for(int i=0;i<q;i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            long pro=0;
            while(true)
            {
                if(l==1)
                {
                   long z=((w[0]%mod)*(w[0]%mod))%mod;
                   pro=((pro%mod)+(z%mod))%mod;
                   break;
                }
                else
                {
                    long z=((w[l-1]%mod)*(w[r-1]%mod))%mod;
                    pro=((pro%mod)+(z%mod))%mod;
                    l=map.get(l);
                    r=map.get(r);
                }
            }
            System.out.println(pro);
        }
    }
}