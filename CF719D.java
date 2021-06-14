import java.io.*;
import java.util.*;
public class CF719D
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            HashMap<Long,Long> map=new HashMap();
            long ans=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                long f=a[i]-(i+1);
                long val=map.getOrDefault(f,0L);
                map.put(f,val+1);
            }
            for(Map.Entry<Long,Long> entry: map.entrySet())
            {
                long val=entry.getValue();
                ans+=((val*(val-1))/2);
            }
            System.out.println(ans);
        }
    }
}