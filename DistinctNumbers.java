import java.io.*;
import java.util.*;
public class DistinctNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1])
            {
                if(ans==0)
                    ans+=2;
                else
                    ans++;
            }
        }
        if(ans==0)
            ans++;
        System.out.println(ans);
    }
}