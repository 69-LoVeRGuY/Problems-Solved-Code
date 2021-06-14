import java.io.*;
import java.util.*;
public class A708
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int ans[]=new int[n];
            TreeSet<Integer> set=new TreeSet();
            List<Integer> rest=new ArrayList();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(set.contains(a[i]))
                    rest.add(a[i]);
                set.add(a[i]);
            }
            int c=0;
            for(Integer value : set)
            {
                ans[c]=value;
                c++;
            }
            for(int i=0;i<rest.size();i++)
            {
                ans[c]=rest.get(i);
                c++;
            }
            for(int i=0;i<n;i++)
                System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
}