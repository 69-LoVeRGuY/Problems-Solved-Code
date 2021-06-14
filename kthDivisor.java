import java.io.*;
import java.util.*;
public class kthDivisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        List<Long> l=new ArrayList();
        for(long i=1;i<=(long)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                    l.add(i);
                else
                {
                    l.add(i);
                    l.add(n/i);
                }
            }
        }
        Collections.sort(l);
        if(k>l.size())
            System.out.println(-1);
        else
            System.out.println(l.get(k-1));
    }
}