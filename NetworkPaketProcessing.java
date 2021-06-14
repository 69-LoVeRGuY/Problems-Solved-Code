import java.io.*;
import java.util.*;
public class NetworkPaketProcessing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        if(n==0)
            System.exit(0);
        HashMap<Integer,Integer> map=new HashMap();
        int a[]=new int[n];
        int b[]=new int[n];
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            if(map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        TreeMap<Integer,Integer> tmap=new TreeMap(map);
        int f=0,c=0,carry=a[0];
        for(Map.Entry<Integer,Integer> entry : tmap.entrySet())
        {
            int k=entry.getValue();
            f=f+k;
            if(f<s)
                continue;
            else if(f>=s)
            {
                for(int i=c;i<c+s;i++)
                {
                    if(i==0)
                        ans[i]=a[i];
                    else
                    {
                        ans[i]=carry+b[i-1];
                        carry+=b[i-1];
                    }
                }
                c=f;
                f=0;
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(ans[i]);
    }
}