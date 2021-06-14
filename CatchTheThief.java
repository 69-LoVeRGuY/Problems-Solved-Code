import java.io.*;
import java.util.*;
public class CatchTheThief
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            int n=sc.nextInt();
            int f=0;
            int mid=(x+y)/2;
            int diff1=Math.abs(mid-x);
            int diff2=Math.abs(mid-y);
            int q1=diff1/k;
            int q2=diff2/k;
            if(diff1%k==0 && diff2%k==0 && q1==q2)
                f=1;
            if(f==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}