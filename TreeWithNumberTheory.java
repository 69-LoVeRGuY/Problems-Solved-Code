import java.io.*;
import java.util.*;
public class TreeWithNumberTheory
{
    static HashMap<Integer,HashSet<Integer>> map=new HashMap();
    static int ans=0;
    static int recur(int v, int w)
    {
        if(map.containsKey(v)==false)
            return w;
        if(w%map.get(v).size()!=0)
            return 0;
        HashSet<Integer> set=map.get(v);
        Iterator itr=set.iterator();
        int c=0;
        while(itr.hasNext())
        {
            int f=(int)itr.next();
            c+=recur(f,(w/(set.size())));
        }
        return (ans+c);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n-1];
        if(n>1)
        {
            for(int i=0;i<(n-1);i++)
            {
                a[i]=sc.nextInt();
                if(map.containsKey(a[i]))
                {
                    HashSet<Integer> set=map.get(a[i]);
                    set.add((i+2));
                    map.put(a[i],set);
                }
                else
                {
                    HashSet<Integer> set=new HashSet();
                    set.add((i+2));
                    map.put(a[i],set);
                }
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int v=sc.nextInt();
            int w=sc.nextInt();
            if(n==1 || map.containsKey(v)==false)
            {
                System.out.println(0);
                continue;
            }
            int size=map.get(v).size();
            if(size>0 && w%size!=0)
            {
                System.out.println(w);
                continue;
            }
            int count=recur(v,w);
            System.out.println((w-count));
        }
    }
}