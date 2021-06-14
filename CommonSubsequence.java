import java.io.*;
import java.util.*;
public class CommonSubsequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[1001];
            int ans=-1;
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                a[b]++;
            }
            for(int i=0;i<m;i++)
            {
                int b=sc.nextInt();
                if(a[b]>0)
                    ans=b;
            }
            if(ans>0)
            {
                System.out.println("YES");
                System.out.println(1+" "+ans);
            }
            else
                System.out.println("NO");
        }
    }
}
        