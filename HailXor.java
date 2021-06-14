import java.io.*;
import java.util.*;
public class HailXor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            TreeSet<Integer> masterset=new TreeSet();
            int count=0,p=0,q=1,zero=0;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            while(q<n)
            {
                List<Integer> list=new ArrayList();
                for(Integer value : masterset)
                {
                    if((a[p]^value)<a[p])
                    {
                        a[p]=a[p]^value;
                        list.add(value);
                    }
                    if(value>a[p])
                        break;
                }
                for(int z=0;z<list.size();z++)
                    masterset.remove(list.get(z));
                int pow=(int)(Math.log(a[p])/Math.log(2));
                int num=(int)Math.pow(2,pow);
                if(count<x && ((a[p]^num)<a[p]))
                {
                    count++;
                    a[p]=a[p]^num;
                    if(a[p]==0)
                        zero++;
                    if((a[q]^num)<a[q])
                    {
                        a[q]=a[q]^num;
                        if(a[q]==0)
                            zero++;
                    }
                    else
                        masterset.add(num);
                }
                if(a[p]==0 || count>=x)
                {
                    p++;
                    q++;
                }
            }
            int diff=x-count;
            if((zero==(n-1) || zero==n) && n>2 && count<x && diff%2!=0)
            {
                count++;
                diff--;
            }
            if(masterset.size()>0)
            {
                for(Integer value : masterset)
                    a[n-1]=a[n-1]^value;
            }
            if(diff%2!=0)
            {
                a[n-2]=a[n-2]^1;
                a[n-1]=a[n-1]^1;
            }
            for(int r=0;r<n;r++)
                System.out.print(a[r]+" ");
            System.out.println();
        }
    }
}