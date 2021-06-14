import java.io.*;
import java.util.*;
public class DoofOnCartesian
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int max=-1;
            HashSet<Integer> set=new HashSet();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(i==n-1)
                    max=a;
                set.add(a);
            }
            List<Integer> list=new ArrayList();
            int a=0;
            for(int i=0;i<n;i++)
            {
                if(set.contains(i))
                    a++;
                list.add(a);
            }
            Integer b[]=new Integer[list.size()];
            b=list.toArray(b);
            int q=sc.nextInt();
            for(int i=0;i<q;i++)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(x==0 && y==0)
                    System.out.println(0);
                else if(set.contains(x+y))
                    System.out.println(-1);
                else
                {
                    int big=Math.max(x,y);
                    if(big>max)
                        System.out.println(n);
                    else
                        System.out.println(b[big]);
                }
            }
        }
    }
}