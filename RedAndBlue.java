import java.io.*;
import java.util.*;
public class RedAndBlue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        int sum[]=new int[n+m];
        int i=0,j=0,c=0;
        while(i<n || j<m)
        {
            if(i<n && j<m)
            {
                if(a[i]>=b[j])
                {
                    if(c>0)
                        sum[c]=sum[c-1]+a[i];
                    else
                        sum[c]=a[i];
                    c++;
                    i++;
                }
                else
                {
                    if(c>0)
                        sum[c]=sum[c-1]+b[i];
                    else
                        sum[c]=b[i];
                    c++;
                    j++;
                }
            }
            else if(i<n && j>=m)
            {
                sum[c]=sum[c-1]+a[i];
                c++;
                i++;
            }
            else if(i>=n && j<m)
            {
                sum[c]=sum[c-1]+b[j];
                c++;
                j++;
            }
        }
        Arrays.sort(sum);
        int ans=sum[(n+m-1)];
        if(ans<0)
            System.out.println(0);
        else
            System.out.println(ans);
    }}
}