import java.io.*;
import java.util.*;
public class PashmakAndFlowers
{
    static long binomialCoeff(long n, long k)
    {
        long res = 1;
     
        // Since C(n, k) = C(n, n-k)
        if (k > n - k)
            k = n - k;
     
        // Calculate value of
        // [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]
        for (long i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
     
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        HashMap<Long,Long> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
            long val=map.getOrDefault(a[i],0L);
            map.put(a[i],val+1);
        }
        Arrays.sort(a);
        if(a[0]==a[n-1])
            System.out.println(0+" "+binomialCoeff(map.get(a[0]),2));
        else
        {
            long ans=map.get(a[0])*map.get(a[n-1]);
            System.out.println((a[n-1]-a[0])+" "+ans);
        }
    }
}