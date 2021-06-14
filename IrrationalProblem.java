import java.io.*;
import java.util.*;
public class IrrationalProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        HashSet<Integer> set=new HashSet();
        int p1=sc.nextInt();
        set.add(p1);
        if(p1<min)
            min=p1;
        int p2=sc.nextInt();
        set.add(p2);
        if(p2<min)
            min=p2;
        int p3=sc.nextInt();
        set.add(p3);
        if(p3<min)
            min=p3;
        int p4=sc.nextInt();
        set.add(p4);
        if(p4<min)
            min=p4;
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(set.size()<3)
        {
            System.out.println(0);
            System.exit(0);
        }
        int res=0;
        for(int i=a;i<=b;i++)
        {
            if(i<min)
                res++;
            else 
                break;
        }
        if(res<=0)
            System.out.println(0);
        else
            System.out.println(res);
    }
}