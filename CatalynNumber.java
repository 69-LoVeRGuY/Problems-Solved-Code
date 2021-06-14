import java.io.*;
import java.util.*;
public class CatalynNumber
{
    static long dp[]=new long[101];
    static long solve(int n)
    {
        long ans=0;
        if(n==0 || n==1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        for(int i=1;i<=n;i++)
        {
            ans+=solve(i-1)*solve(n-i);
        }
        return dp[n]=ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }
}