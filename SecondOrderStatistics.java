import java.io.*;
import java.util.*;
public class SecondOrderStatistics
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList();
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(set.contains(a)==false)
            {
                set.add(a);
                list.add(a);
            }
        }
        Collections.sort(list);
        if(list.size()>=2)
            System.out.println(list.get(1));
        else
            System.out.println("NO");
    }
}