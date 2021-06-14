import java.io.*;
import java.util.*;
public class TvSubscriptionHard
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int min=Integer.MAX_VALUE,initial=0;
            HashMap<Integer,Integer> map=new HashMap();
            for(int i=0;i<d;i++)
            {
                int val=map.getOrDefault(a[i],0);
                map.put(a[i],val+1);
            }
            if(map.size()<min)
                min=map.size();
            for(int i=d;i<n;i++)
            {
                int val=map.get(a[initial]);
                if(val-1==0)
                    map.remove(a[initial]);
                else
                    map.put(a[initial],val-1);
                if(map.containsKey(a[i])==false)
                    map.put(a[i],1);
                else
                    map.put(a[i],(map.get(a[i])+1));
                if(map.size()<min)
                    min=map.size();
                initial++;
            }
            if(map.size()<min)
                min=map.size();
            System.out.println(min);
        }
    }
}