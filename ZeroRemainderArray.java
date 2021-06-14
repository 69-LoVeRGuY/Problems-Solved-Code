import java.io.*;
import java.util.*;
public class ZeroRemainderArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=2;
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            Integer b[]=new Integer[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]<=k)
                    b[i]=k-a[i];
                else
                {
                    int r=a[i]%k;
                    if(r==0)
                        b[i]=0;
                    else
                        b[i]=k-r;
                }
            }
            Arrays.sort(b);
            int i=1;
            while(i<b.length)
            {
                if(b[i]==b[i-1] && b[i]!=0)
                {
                    int q=(k*c)-(k-b[i]);
                    if(q<k)
                        c++;
                    b[i]=(k*c)-(k-b[i]);
                    Arrays.sort(b);
                }
                else
                    i++;
                for(int j=0;j<b.length;j++)
                    System.out.print(b[j]+" ");
                System.out.println(i);
            }
            if(b[n-1]!=0)
                System.out.println(b[n-1]+1);
            else
                System.out.println(0);
        }
    }
}