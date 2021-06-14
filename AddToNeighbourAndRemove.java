import java.io.*;
import java.util.*;
public class AddToNeighbourAndRemove
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=Integer.MIN_VALUE,totmax=0,freq=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>max)
                    max=a[i];
            }
            List<Integer> list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                if(a[i]==max)
                {
                    list.add(i);
                    freq++;
                }
            }
            if(list.size()==n)
            {
                System.out.println(0);
                continue;
            }
            int count=0,prev=0;
            List<Integer> last=new ArrayList();
            HashSet<Integer> set=new HashSet();
            for(int i=0;i<list.size();i++)
            {
                int add=0,sum=0;
                if(prev==(list.get(i)-1))
                {
                    last.add(max);
                    totmax++;
                    prev=list.get(i);
                    continue;
                }
                for(int j=prev;j<list.get(i);j++)
                {
                    sum+=a[j];
                    add++;
                }
                add--;
                if(add>=0)
                    count=count+add;
                last.add(sum);
                set.add(sum);
                if(totmax<freq)
                {
                    last.add(max);
                    set.add(max);
                    totmax++;
                }
                prev=list.get(i);
            }
            int r=0,count2=0;
            for(int i=prev+1;i<list.size();i++)
            {
                r=r+list.get(i);
                count2++;
            }
            if(r>0)
            {
                last.add(r);
                set.add(r);
                count2--;
                if(count2>=0)
                    count=count+count2;
            }
            if(set.size()==2)
                System.out.println(count);
            else
            {
                count=count+last.size()-1;
                System.out.println(count);
            }
        }
    }
}