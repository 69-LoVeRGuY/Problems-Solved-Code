import java.io.*;
import java.util.*;
public class ObtainTwoZeros
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            double p1=((2*a)-b)/(double)3;
            double p2=((2*b)-a)/(double)3;
            double r1=Math.floor(p1);
            double r2=Math.floor(p2);
            if(Math.max(a,b)>(2*Math.min(a,b)))
                System.out.println("NO");
            else if((2*a)==b)
                System.out.println("YES");
            else if(a==(2*b))
                System.out.println("YES");
            else if(((p1==r1)&&(a!=0 && b!=0)) || ((p2==r2)&&(a!=0 && b!=0)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}