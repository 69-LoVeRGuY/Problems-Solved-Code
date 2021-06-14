import java.io.*;
import java.util.*;
public class OneZeroSwaps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String p=sc.next();
            if(s.equals(p))
            {
                System.out.println("Yes");
                continue;
            }
            int sone=0,szero=0,pone=0,pzero=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='1')
                    sone++;
                else
                    szero++;
                if(p.charAt(i)=='1')
                    pone++;
                else
                    pzero++;
            }
            if(sone!=pone || szero!=pzero)
            {
                System.out.println("No");
                continue;
            }
            List<Integer> list1=new ArrayList();
            List<Integer> list2=new ArrayList();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)!=p.charAt(i))
                {
                    if(s.charAt(i)=='1')
                        list1.add(i);
                    else
                        list2.add(i);
                }
            }
            if(list1.size()!=list2.size())
            {
                System.out.println("No");
                continue;
            }
            int f=0;
            for(int i=0;i<list1.size();i++)
            {
                if(list1.get(i)>list2.get(i))
                {
                    f=-1;
                    break;
                }
            }
            if(f==-1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}