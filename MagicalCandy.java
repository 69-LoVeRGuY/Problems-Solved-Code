import java.io.*;
import java.util.*;
public class MagicalCandy
{
    public static void main(String ags[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod=1000000007;
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            int q=sc.nextInt();
            long r[]=new long[q];
            long z[]=new long[n];
            String s="";
            if(a[n-1]%2==0)
                s="even";
            else
                s="odd";
            for(int i=0;i<q;i++)
                r[i]=sc.nextLong();
            if(n==1 && a[0]==1)
            {
                for(int i=0;i<q;i++)
                {
                    System.out.println(r[i]);
                }
                continue;
            }
            if(a[0]!=1)
            {
                for(int i=0;i<n;i++)
                {
                    if(i>0)
                    {
                        if(a[i-1]%2==0)
                            z[i]=z[i-1]+a[i];
                        else
                        {
                            if(a[i-1]!=1)
                            {
                                if(a[i-1]%2!=0)
                                    z[i]=z[i-1]-1+a[i];
                                else
                                    z[i]=a[i-1]+a[i];
                            }
                            else
                            {
                                if(a[i-2]%2==0)
                                    z[i]=z[i-2]-1+a[i];
                                else
                                    z[i]=z[i-2]+a[i];
                            }
                        } 
                    }
                    else
                        z[i]=a[i];
                }
                for(int i=0;i<q;i++)
                {
                    int qou=(int)(r[i]/(long)n);
                    int rem=(int)(r[i]%(long)n);
                    long ans=0;
                    if(s.contains("odd"))
                    {
                        if(rem>0 && qou>0)
                            ans=(((qou*z[n-1])%mod)+(z[rem-1]%mod))%mod;
                        else if(rem>0 && qou==0)
                            ans=z[rem-1]%mod;
                        else
                            ans=(qou*z[n-1])%mod;
                    }
                    else
                    {
                        if(rem>0 && qou>0)
                            ans=(((qou*z[n-1])%mod)-(qou%mod)+(z[rem-1]%mod))%mod;
                        else if(rem>0 && qou==0)
                            ans=z[rem-1]%mod;
                        else
                            ans=(((qou*z[n-1])%mod)-((qou-1)%mod))%mod;
                    }
                    System.out.println(ans);
                }
            }
            else
            {
                for(int i=0;i<q;i++)
                {
                    if(r[i]==1)
                        System.out.println(1);
                    else
                    {
                        long rem=r[i]%n;
                        long div=(int)(r[i]/n);
                        if(rem==1 || rem==0)
                            System.out.println(div);
                        else
                            System.out.println(div+1);
                    }
                }
            }
        }
    }
}