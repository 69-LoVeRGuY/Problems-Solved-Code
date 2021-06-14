import java.io.*;
import java.util.*;
public class BalancedTeam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int max=0;
        for(int i=0,end=0;i<n;i++)
        {
            while(end<n && a[end]-a[i]<6)
            {
                end++;
                max=Math.max(max,end-i);
            }
        }
        System.out.println(max);
    }
}