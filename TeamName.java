import java.io.*;
import java.util.*;
public class TeamName
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int count=0,f=0;
            HashMap<String,HashSet<Character>> map=new HashMap();
            HashSet<String> list=new HashSet();
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                String r=s.substring(1);
                list.add(r);
                if(map.containsKey(r))
                {
                    HashSet<Character> set=map.get(r);
                    set.add(s.charAt(0));
                    map.put(r,set);
                }
                else
                {
                    HashSet<Character> set=new HashSet();
                    set.add(s.charAt(0));
                    map.put(r,set);
                }
            }
            String a[]=new String[list.size()];
            a=list.toArray(a);
            for(int i=0;i<a.length-1;i++)
            {
                HashSet<Character> set=map.get(a[i]);
                for(int j=i+1;j<a.length;j++)
                {
                    HashSet<Character> set1=map.get(a[j]);
                    Iterator itr=set1.iterator();
                    int c=0,freq=0;
                    while(itr.hasNext())
                    {
                        if(set.contains(itr.next())==false)
                            freq+=set.size();
                        else
                            c++;
                    }
                    freq=freq-(c*(set1.size()))+(c*(set1.size()-c));
                    freq*=2;
                    count+=freq;
                    System.out.println(count);
                }
            }
            if(count<0)
                count=0;
            System.out.println(count);
        }
    }
}