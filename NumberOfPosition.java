import java.io.*;
import java.util.*;
public class NumberOfPosition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        HashSet<Integer> set=new HashSet();
        List<Integer> list=new ArrayList();
        for(int i=a+1;i<=n;i++)
            set.add(i);
        for(int i=n;i>=(n-b);i--)
        {
            if(set.contains(i))
                list.add(i);
        }
        System.out.println(list.size());
    }
}