import java.io.*;
import java.util.*;
public class ChefLikesGoodSequences
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(n==1)
            {
                System.out.println(1);
                continue;
            }
            a[x-1]=y;
            int len=0,maxlen=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                len++;
                if(i>0)
                {
                    if(a[i]==a[i-1])
                    {
                        if(len-1>maxlen)
                            maxlen=len-1;
                        
                    }
                    else
                    {
                        if(len>maxlen)
                            maxlen=len;
                    }
                }
            }
            System.out.println(maxlen);
        }
    }
}