import java.io.*;
import java.util.*;
public class NumberBox
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            int d[]=new int[n*m];
            int f=0,count=0,sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                    if(a[i][j]<0)
                        count++;
                    d[f]=Math.abs(a[i][j]);
                    f++;
                }
            }
            Arrays.sort(d);
            for(int i=0;i<(n*m);i++)
            {
                if(count%2!=0 && i==0)
                    sum-=d[i];
                else
                    sum+=d[i];
            }
            System.out.println(sum);
        }
    }
}