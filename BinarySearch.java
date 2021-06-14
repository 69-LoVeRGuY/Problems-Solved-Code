import java.io.*;
import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int pos=sc.nextInt();
        long ans=1;
        int smaller=0,greater=0,left=0,right=n,count=0,ts=0,tg=0;
        ts=x-1;
        tg=n-x;
        while(left<right)
        {
            while(((left+right)/2)>pos)
            {
                greater++;
                count++;
                right=(left+right)/2;
                if(left>=right)
                    break;
            }
            while(((left+right)/2)<pos)
            {
                smaller++;
                count++;
                left=((left+right)/2)+1;
                if(left>=right)
                    break;
            }
            if(((left+right)/2)==pos)
                left=((left+right)/2)+1;
        }
        for(int i=2;i<=(n-(count+1));i++)
            ans=(ans*i)%1000000007;
        for(int i=greater;i>0;i--)
        {
            ans=(ans*tg)%1000000007;
            tg--;
        }
        for(int i=smaller;i>0;i--)
        {
            ans=(ans*ts)%1000000007;
            ts--;
        }
        System.out.println(ans);
    }
}