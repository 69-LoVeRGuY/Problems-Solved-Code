import java.io.*;
import java.util.*;
public class YetAnotherBookshelf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> list=new ArrayList();
            int one=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==1)
                    list.add(i);
            }
            if(list.size()==1)
            {
                System.out.println(0);
                continue;
            }
            int count=0;
            for(int i=1;i<list.size();i++)
                count+=list.get(i)-list.get(i-1)-1;
            System.out.println(count);
        }
    }
}