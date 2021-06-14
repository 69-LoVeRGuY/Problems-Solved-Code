import java.io.*;
import java.util.*;
public class ChefinaAndSwaps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashMap<Integer,Integer> merge=new HashMap();
            HashMap<Integer,Integer> a=new HashMap();
            HashMap<Integer,Integer> b=new HashMap();
            List<Integer> r=new ArrayList();
            int f=0,mina=Integer.MAX_VALUE,minb=Integer.MAX_VALUE,min=0;
            long ans=0;
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                mina=Math.min(x,mina);
                if(a.containsKey(x))
                    a.put(x,a.get(x)+1);
                else
                    a.put(x,1);
                if(merge.containsKey(x))
                    merge.put(x,merge.get(x)+1);
                else
                    merge.put(x,1);
            }
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                minb=Math.min(x,minb);
                if(b.containsKey(x))
                    b.put(x,b.get(x)+1);
                else
                    b.put(x,1);
                if(merge.containsKey(x))
                    merge.put(x,merge.get(x)+1);
                else
                    merge.put(x,1);
            }
            for(Map.Entry e: merge.entrySet())
            {
                int value=(int)e.getValue();
                if(value%2!=0)
                {
                    f=-1;
                    break;
                }
            }
            if(f==-1)
            {
                System.out.println(-1);
                continue;
            }
            for(Map.Entry e: a.entrySet())
            {
                int key=(int)e.getKey();
                int value=(int)e.getValue();
                int diff=0;
                if(b.containsKey(key))
                {
                    int z=b.get(key);
                    b.put(key,0);
                    diff=Math.abs(value-z);
                }
                else
                    diff=value;
                for(int i=0;i<(diff/2);i++)
                    r.add(key);
            }
            for(Map.Entry e: b.entrySet())
            {
                int key=(int)e.getKey();
                int value=(int)e.getValue();
                if(value!=0)
                {
                    for(int i=0;i<(value/2);i++)
                        r.add(key);
                }
            }
            Collections.sort(r);
            if(r.size()==0)
            {
                System.out.println(0);
                continue;
            }
            min=Math.min(mina,minb);
            Integer m[]=new Integer[r.size()];
            m=r.toArray(m);
            if(m[0]==min)
            {
                int count=0;
                for(int i=0;i<m.length;i++)
                {
                    if(m[i]==min)
                        count++;
                }
                ans=m.length-(2*count)+count;
            }
            else
                ans=m.length;
            System.out.println(ans);
        }
    }
}