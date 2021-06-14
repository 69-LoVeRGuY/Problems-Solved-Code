import java.io.*;
import java.util.*;
public class XorEngine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            int ec=0,oc=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                int count=Integer.bitCount(a[i]);
                if(count%2==0)
                    ec++;
                else
                    oc++;
            }
            for(int i=0;i<q;i++)
            {
                int p=sc.nextInt();
                int count=Integer.bitCount(p);
                if(count%2==0)
                    System.out.println(ec+" "+oc);
                else
                    System.out.println(oc+" "+ec);
            }
        }
    }
}