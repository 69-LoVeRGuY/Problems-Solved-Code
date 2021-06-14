import java.io.*;
import java.util.*;
public class HonestCoach
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            Set<Integer> hm=new HashSet();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                hm.add(a[i]);
            }
            if(hm.size()!=n)
            {
                System.out.println(0);
                continue;
            }
            int x=Integer.MAX_VALUE;
            Arrays.sort(a);
            for(int i=1;i<n;i++)
            {
                if(a[i]-a[i-1]<x)
                    x=a[i]-a[i-1];
            }
            System.out.println(x);
        }
    }
}