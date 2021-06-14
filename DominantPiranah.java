import java.io.*;
import java.util.*;
public class DominantPiranah
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
            int p=-1,max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                set.add(a[i]);
                if(a[i]>max)
                    max=a[i];
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]==max)
                {
                    if(i+1<n)
                    {
                        if(a[i+1]<max)
                        {
                            p=i+1;
                            break;
                        }
                    }
                    if(i-1>=0)
                    {
                        if(a[i-1]<max)
                        {
                            p=i+1;
                            break;
                        }
                    }
                }
            }
            if(set.size()==1)
                System.out.println("-1");
            else
                System.out.println(p);
        }
    }
}