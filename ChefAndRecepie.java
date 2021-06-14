import java.io.*;
import java.util.*;
public class ChefAndRecepie
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[1001];
            int max=0,f=0;
            Arrays.fill(b,0);
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                b[a[i]]++;
                if(a[i]>max)
                    max=a[i];
            }
            Set<Integer> hs=new HashSet();
            int c=0;
            for(int i=0;i<=max;i++)
            {
                if(b[i]!=0)
                {
                   c++;
                   hs.add(b[i]);
                }
            }
            if(hs.size()!=c)
            {
                System.out.println("NO");
                f=-1;
                continue;
            }
            HashMap<Integer,Integer> hm=new HashMap();
            for(int i=0;i<n;i++)
            {
                if(hm.containsKey(a[i]))
                {
                    Integer x=hm.get(a[i]);
                    if(i-x==1)
                        hm.replace(a[i],i);
                    else
                    {
                        System.out.println("NO");
                        f=-1;
                        break;
                    }
                }
                else
                    hm.put(a[i],i);
            }
            if(f==0)
                System.out.println("YES");
        }
    }
}