import java.io.*;
import java.util.*;
public class FrogSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int l[]=new int[n];
            int count=0;
            HashMap<Integer,Integer> map=new HashMap();
            HashMap<Integer,Integer> pos=new HashMap();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                pos.put(a[i],(i+1));
            }
            for(int i=0;i<n;i++)
                l[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                map.put(a[i],l[i]);
            int b[]=a.clone();
            Arrays.sort(b);
            for(int i=1;i<n;i++)
            {
                if(pos.get(b[i])<=pos.get(b[i-1]))
                {
                    while(pos.get(b[i])<=pos.get(b[i-1]))
                    {
                        int val=pos.get(b[i])+map.get(b[i]);
                        pos.put(b[i],val);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}