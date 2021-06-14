import java.io.*;
import java.util.*;
public class StrangePartition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
           int n=sc.nextInt();
           int x=sc.nextInt();
           int a[]=new int[n];
           long sum=0;
           long ans[]=new long[2];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
               int r=(int)Math.ceil(a[i]/(double)x);
               ans[0]+=r;
               sum+=a[i];
           }
           ans[1]=(long)Math.ceil(sum/(double)x);
           Arrays.sort(ans);
           System.out.println(ans[0]+" "+ans[1]);
        }
    }
}