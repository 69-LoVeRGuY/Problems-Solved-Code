import java.io.*;
import java.util.*;
public class Knapsack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long w=sc.nextLong();
            long mid=0;
            if(w%2==0)
                mid=w/2;
            else
                mid=(w/2)+1;
            long a[]=new long[n];
            long sum=0,min=Long.MAX_VALUE,ia=-1;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
                if(a[i]>=mid && a[i]<=w)
                    ia=i+1;
                if(a[i]<min)
                    min=a[i];
                sum=sum+a[i];
            }
            if(sum<mid || min>w)
            {
                System.out.println(-1);
                continue;
            }
            if(ia!=-1)
            {
                System.out.println(1);
                System.out.println(ia);
                continue;
            }
            List<Integer> list=new ArrayList();
            long add=0,count=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]<=w && (add+a[i]<=w))
                {
                    count++;
                    list.add(i+1);
                    add=add+a[i];
                    if(add>=mid)
                        break;
                }
            }
            if(add>=mid)
            {
                System.out.println(count);
                for(int i=0;i<list.size();i++)
                    System.out.print(list.get(i)+" ");
                System.out.println();
            }
            else
                System.out.println(-1);
        }
    }
}