import java.io.*;
import java.util.*;
public class BuyingShovels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ans=n;
            for(int i=1;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    if(i<=k)
                        ans=Math.min(ans,n/i);
                    if(n/i<=k)
                        ans=Math.min(ans,i);
                }
            }
            System.out.println(ans);
        }
    }
}