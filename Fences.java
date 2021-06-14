import java.io.*;
import java.util.*;
public class Fences
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int h[]=new int[n];
        int min=Integer.MAX_VALUE,ans=0,sum=0,c=0,f=0;
        for(int i=0;i<n;i++)
        {
            h[i]=sc.nextInt();
            sum=sum+h[i];
            c++;
            if(c==k)
            {
                if(sum<min)
                {
                    min=sum;
                    ans=f;
                }
                sum=sum-h[f];
                f++;
                c=k-1;
            }
        }
        System.out.println(ans+1);
    }
}   