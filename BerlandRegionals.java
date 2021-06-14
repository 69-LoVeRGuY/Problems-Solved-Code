import java.io.*;
import java.util.*;
public class BerlandRegionals
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int u[]=new int[n];
            for(int i=0;i<n;i++)
                u[i]=sc.nextInt();
            HashMap<Integer,List<Integer>> map=new HashMap();
            for(int i=0;i<n;i++)
            {
                int v=sc.nextInt();
                if(map.containsKey(u[i]))
                {
                    List<Integer> list=map.get(u[i]);
                    list.add(v);
                    map.put(u[i],list);
                }
                else
                {
                    List<Integer> list=new ArrayList();
                    list.add(v);
                    map.put(u[i],list);
                }
            }
            for(Map.Entry<Integer,List<Integer>> entry: map.entrySet())
            {
                List<Integer> list=map.getValue();
                Collections.sort(list,Collections.reverseOrder());
                for(int i=1;i<list.size();i++)
                    list.set(i,(list.get(i)+list.get(i-1)));
                map.put(