import java.io.*;
import java.util.*;
public class Jumps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int count=0,sum=0;
            while(sum<n)
            {
                count++;
                sum+=count;
            }
            int diff=sum-n;
            if(diff!=1 || sum==n)
                System.out.println(count);
            else
                System.out.println((count+1));
        }
    }
}