import java.io.*;
import java.util.*;
public class NoldbachProblem
{
    static List<Integer> set=new ArrayList();
    static void sieveOfEratosthenes(int n)
    {
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==true)
                set.add(i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k==0)
        {
            System.out.println("YES");
            System.exit(0);
        }
        if(n<13 || k>=n)
        {
            System.out.println("NO");
            System.exit(0);
        }
        int count=0;
        sieveOfEratosthenes(n);
        Integer a[]=new Integer[set.size()];
        a=set.toArray(a);
        for(int i=5;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
               if(a[j]+a[j+1]+1==a[i])
               {
                   count++;
                   break;
               }
               else if(a[j]+a[j+1]+1>a[i])
                    break;
               if(a[j]>=a[i])
                    break;
            }
            if(count>=k)
                break;
        }
        if(count>=k)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}