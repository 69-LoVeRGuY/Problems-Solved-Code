import java.io.*;
import java.util.*;
public class LunchRush
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int t[]=new int[n];
        int f[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            f[i]=sc.nextInt();
            t[i]=sc.nextInt();
            if(t[i]<=k)
                ans[i]=f[i];
            else
                ans[i]=f[i]-(t[i]-k);
        }
        Arrays.sort(ans);
        System.out.println(ans[n-1]);
    }
}