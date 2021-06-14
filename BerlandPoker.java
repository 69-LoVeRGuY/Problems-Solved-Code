import java.io.*;
import java.util.*;
public class BerlandPoker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            if(m==0)
            {
                System.out.println(0);
                continue;
            }
            if(m==1)
            {
                System.out.println(1);
                continue;
            }
            int card=n/k;
            if(m<=card)
            {
                System.out.println(m);
                continue;
            }
            else
            {
                int a[]=new int[k-1];
                int max=card;
                int c=0,i=m-card;
                while(i>0)
                {
                    if(c!=k-2)
                    {
                        a[c]++;
                        c++;
                        i--;
                    }
                    else
                    {
                        a[c]++;
                        c=0;
                        i--;
                    }
                }
                Arrays.sort(a);
                System.out.println(max-a[k-2]);
            }
        }
    }
}