import java.io.*;
import java.util.*;
class Covid19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            List<Integer> l=new ArrayList();
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int j=1,c=1;
            while(j<n)
            {
                if(a[j]-a[j-1]<=2)
                    c++;
                else
                {
                    l.add(c);
                    c=1;
                }
                j++;
            }
            l.add(c);
            Collections.sort(l);
            System.out.println(l.get(0)+" "+l.get(l.size()-1));
        }
    }
}