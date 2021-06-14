import java.io.*;
import java.util.*;
public class UniqueBid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> list=new ArrayList();
            HashMap<Integer,Integer> map=new HashMap();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(map.containsKey(a[i]))
                    map.put(a[i],map.get(a[i])+1);
                else
                    map.put(a[i],1);
            }
            for(Map.Entry entry : map.entrySet())
            {
                if((int)(entry.getValue())==1)
                    list.add((int)(entry.getKey()));
            }
            if(list.size()==0)
            {
                System.out.println(-1);
                continue;
            }
            Collections.sort(list);
            int f=list.get(0),ans=-1;
            for(int i=0;i<n;i++)
            {
                if(a[i]==f)
                {
                    ans=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}