import java.io.*;
import java.util.*;
public class kFactorization
{
    static boolean prime[];
    static List<Integer> list=new ArrayList();
    static void sieveOfEratosthenes(int n)
    {
        prime=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
    }
    static int primefactors(int n)
    {
        int count=0;
        while(n%2==0)
        {
            count++;
            list.add(2);
            n/=2;
        }
        for(int i=3;i<=n;i++)
        {
            if(prime[i]==true && n%i==0)
            {
                while(n%i==0)
                {
                    count++;
                    list.add(i);
                    n/=i;
                }
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sieveOfEratosthenes(n);
        if(k==1)
        {
            System.out.println(n);
            System.exit(0);
        }
        if(prime[n]==true)
            System.out.println(-1);
        else
        {
            int f=primefactors(n);
            Collections.sort(list,Collections.reverseOrder());
            Integer a[]=new Integer[list.size()];
            a=list.toArray(a);
            if(k>f)
                System.out.println(-1);
            else if(k==f)
            {
                for(int i=0;i<k;i++)
                    System.out.print(a[i]+" ");
                System.out.println();
            }
            else
            {
                for(int i=0;i<k-1;i++)
                    System.out.print(a[i]+" ");
                int p=1;
                for(int i=k-1;i<f;i++)
                    p*=a[i];
                System.out.println(p);
            }
        }
    }
}       