import java.io.*;
import java.util.*;
public class PokemonArmyEasy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            int flag=0;
            long ans=0;
            for(int i=0;i<n-1;i++)
            {
                if(flag==0)
                {
                    if(a[i]>a[i+1])
                    {
                        ans+=a[i];
                        flag=1;
                    }
                }
                else
                {
                    if(a[i]<a[i+1])
                    {
                        ans-=a[i];
                        flag=0;
                    }
                }
            }
            if(flag==0)
                ans+=a[n-1];
            System.out.println(ans);
        }
    }
}