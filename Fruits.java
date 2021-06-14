import java.io.*;
import java.util.*;
public class Fruits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int price[]=new int[n];
        for(int i=0;i<n;i++)
            price[i]=sc.nextInt();
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<m;i++)
        {
            String s=sc.next();
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        int a[]=price.clone();
        Arrays.sort(a);
        int min=0,max=0,c1=0,c2=n-1;
        List<Integer> list=new ArrayList();
        for(Map.Entry<String,Integer> entry : map.entrySet())
            list.add(entry.getValue());
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<list.size();i++)
        {
            min=min+(list.get(i)*a[c1]);
            c1++;
            max=max+(list.get(i)*a[c2]);
            c2--;
        }
        System.out.println(min+" "+max);
    }
}