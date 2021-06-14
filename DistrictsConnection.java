import java.io.*;
import java.util.*;
public class DistrictsConnection
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> set=new HashSet();
            List<Integer> list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                set.add(a[i]);
                if(a[i]==a[0] && i!=0)
                    list.add(i);
            }
            if(set.size()==1)
            {
                System.out.println("NO");
                continue;
            }
            String s[]=new String[n-1];
            int c=0,h=-1;
            for(int i=1;i<n;i++)
            {
                if(list.contains(i)==false)
                {
                    s[c]=String.valueOf(1)+" "+String.valueOf((i+1));
                    c++;
                    h=i+1;
                }
            }
            if(h!=-1)
            {
                for(int i=0;i<list.size();i++)
                {
                    s[c]=String.valueOf(h)+" "+String.valueOf(list.get(i)+1);
                    c++;
                }
            }
            System.out.println("YES");
            for(int i=0;i<n-1;i++)
                System.out.println(s[i]);
        }
    }
}