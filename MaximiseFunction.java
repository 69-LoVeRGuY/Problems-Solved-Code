import java.io.*;
import java.util.*;
public class MaximiseFunction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int sum=Math.abs(a[0]-a[n-1]);
            int f1=Math.abs(a[0]-a[1])+Math.abs(a[1]-a[n-1]);
            int f2=Math.abs(a[0]-a[n-2])+Math.abs(a[n-2]-a[n-1]);
            sum=sum+Math.max(f1,f2);
            System.out.println(sum);
        }
    }
}