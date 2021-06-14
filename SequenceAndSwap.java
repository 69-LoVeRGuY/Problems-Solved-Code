import java.io.*;
import java.util.*;
public class SequenceAndSwap
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
            int count=0,ini=0;
            List<Integer> list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(i>0)
                {
                    if(a[i]>=a[i-1])
                        ini++;
                    if(a[i]<a[i-1])
                        list.add(i-1);
                }
            }
            if(ini==(n-1))
            {
                System.out.println(0);
                continue;
            }
            int last=list.get(list.size()-1);
            for(int i=0;i<n;i++)
            {
                if(a[i]>x && i<=last)
                {
                    count++;
                    int temp=a[i];
                    a[i]=x;
                    x=temp;
                }
            }
            int b[]=a.clone();
            Arrays.sort(b);
            int f=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]!=b[i])
                {
                    f=-1;
                    break;
                }
            }
            if(f==-1)
                System.out.println(-1);
            else
                System.out.println(count);
        }
    }
}