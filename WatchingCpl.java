import java.io.*;
import java.util.*;
public class WatchingCpl
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            HashMap<Integer,Integer> map=new HashMap();
            int count=0,h1=0,h2=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                int val=map.getOrDefault(a[i],0);
                map.put(a[i],(val+1));
            }
            Arrays.sort(a);
            int i=n-1;
            while(i>=0)
            {
                if(h1<k)
                {
                    if(h1==0)
                    {
                        h1+=a[i];
                        count++;
                        int val=map.get(a[i])-1;
                        if(val==0)
                            map.remove(a[i]);
                        else
                            map.put(a[i],val);
                        i--;
                        continue;
                    }
                    int diff=k-h1;
                    if(map.containsKey(diff))
                    {
                        count++;
                        h1+=diff;
                        int val=map.get(diff)-1;
                        if(val==0)
                            map.remove(diff);
                        else
                            map.put(diff,val);
                        if(a[i]==diff)
                            i--;
                    }
                    else
                    {
                        if(map.containsKey(a[i]))
                        {
                            count++;
                            h1+=a[i];
                            int val=map.get(a[i])-1;
                            if(val==0)
                                map.remove(a[i]);
                            else
                                map.put(a[i],val);
                        }
                        i--;
                    }
                }
                else if(h2<k)
                {
                    if(h2==0)
                    {
                        if(map.containsKey(a[i]))
                        {
                            count++;
                            h2+=a[i];
                            int val=map.get(a[i])-1;
                            if(val==0)
                                map.remove(a[i]);
                            else
                                map.put(a[i],val);
                        }
                        i--;
                        continue;
                    }
                    int diff=k-h2;
                    if(map.containsKey(diff))
                    {
                        count++;
                        h2+=diff;
                        int val=map.get(diff)-1;
                        if(val==0)
                            map.remove(diff);
                        else    
                            map.put(diff,val);
                        if(a[i]==diff)
                            i--;
                    }
                    else
                    {
                        if(map.containsKey(a[i]))
                        {
                            count++;
                            h2+=a[i];
                            int val=map.get(a[i])-1;
                            if(val==0)
                                map.remove(a[i]);
                            else
                                map.put(a[i],val);
                        }
                        i--;
                    }
                }
                if(h1>=k && h2>=k)
                    break;
            }
            if(h1>=k && h2>=k)
                System.out.println(count);
            else
                System.out.println("-1");
        }
    }
}