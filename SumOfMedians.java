import java.io.*;
import java.util.*;
public class SumOfMedians
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n*k];
            for(int i=0;i<(n*k);i++)
                a[i]=sc.nextInt();
            int mid=0,count=0,index=(n*k)-1;
            long ans=0;
            if(n%2==0)
                mid=n/2;
            else
                mid=(n/2)+1;
            int together=n-(mid-1);
            while(count<k)
            {
                for(int i=0;i<together;i++)
                {
                    if(i==together-1)
                        ans+=a[index];
                    index-=1;
                }
                count++;
            }
            System.out.println(ans);
        }
    }
}