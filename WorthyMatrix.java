import java.io.*;
import java.util.*;
public class WorthyMatrix
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
            int a[][]=new int[n][m];
            int row=0,col=0,c=0;
            int ans=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                    if(a[i][j]>=k)
                        ans++;
                    if(c==0 && a[i][j]>=k)
                    {
                        row=i+1;
                        col=j+1;
                        c++;
                    }
                }
            }
            if(c==0)
            {
                System.out.println(ans);
                continue;
            }
            int rc=m-col+1,rr=n-row+1;
            int max=Math.max(rr,rc),min=Math.min(rr,rc);
            int i=2,temp=min;
            min--;
            max--;
            while(i<=temp)
            {
                ans=ans+(min*max);
                min--;
                max--;
                i++;
            }
            System.out.println(ans);
        }
    }
}