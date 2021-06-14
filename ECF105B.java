import java.io.*;
import java.util.*;
public class ECF105B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n+1];
            int u=sc.nextInt();
            a[u]++;
            int r=sc.nextInt();
            a[r]++;
            int d=sc.nextInt();
            a[d]++;
            int l=sc.nextInt();
            a[l]++;
            if(u<=(n-2) && r<=(n-2) && d<=(n-2) && l<=(n-2))
                System.out.println("YES");
            else if((a[n]>=2 && a[0]>0)||(a[n]==3 && a[1]>0)||(a[n]==1 && a[0]>1)||(a[n-1]==1 && a[0]==3)||(a[n-2]==2 && ((l==n-1 && r==n-1)||(u==n-1 && d==n-1))&&((a[0]==1 && a[1]>0)||(a[0]==2))))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}