import java.io.*;
import java.util.*;
public class TroubleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int zero=0,one=0;
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
                if(b[i]==0)
                    zero++;
                else
                    one++;
            }
            int copy[]=a.clone();
            Arrays.sort(copy);
            int f=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]!=copy[i])
                {
                    f=-1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println("Yes");
                continue;
            }
            if(zero>0 && one>0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}