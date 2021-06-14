import java.io.*;
import java.util.*;
public class TernarySequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a0=sc.nextInt();
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int b0=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int sum=0;
            sum=sum+(2*(Math.min(a2,b1)));
            int x=Math.min(a2,b1);
            a2=a2-x;
            b1=b1-x;
            x=Math.min(a1,b0);
            a1=a1-x;
            b0=b0-x;
            x=Math.min(a0,b2);
            a0=a0-x;
            b2=b2-x;
            if(a0>0 && b0>0)
            {
                x=Math.min(a0,b0);
                a0=a0-x;
                b0=b0-x;
            }
            if(b1>0 && a1>0)
            {
                x=Math.min(a1,b1);
                a1=a1-x;
                b1=b1-x;
            }
            if(b2>0 && a2>0)
            {
                x=Math.min(a2,b2);
                a2=a2-x;
                b2=b2-x;
            }
            if(a2>0 && b0>0)
            {
                x=Math.min(a2,b0);
                a2=a2-x;
                b0=b0-x;
            }
            if(a0>0 && b1>0)
            {
                x=Math.min(a0,b1);
                a0=a0-x;
                b1=b1-x;
            }
            if(b2>0 && a1>0)
            {
                sum=sum+((-2)*(Math.min(a1,b2)));
            }
            System.out.println(sum);
        }
    }
}