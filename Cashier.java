import java.io.*;
import java.util.*;
public class Cashier
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int L=sc.nextInt();
        int a=sc.nextInt();
        int t[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            t[i]=sc.nextInt();
            int l=sc.nextInt();
            map.put(t[i],l);
        }
        Arrays.sort(t);
        int ans=0,time=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==0 && t[0]>=a)
                ans=ans+(t[0]/a);
            if(t[i+1]-(t[i]+map.get(t[i]))>=a)
                ans=ans+((t[i+1]-(t[i]+map.get(t[i])))/a);
        }
        if(n==1)
        {
            if(t[0]>=a)
                ans=ans+(t[0]/a);
        }
        if(n>0)
            time=t[n-1]+map.get(t[n-1]);
        if(time<L)
            ans=ans+((L-time)/a);
        System.out.println(ans);
    }
}