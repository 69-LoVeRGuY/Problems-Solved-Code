import java.io.*;
import java.util.*;
public class Reorder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            long sum=0;
            for(int i=0;i<n;i++)
            {
                int z=sc.nextInt();
                sum+=z;
            }
            if(sum==m)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}