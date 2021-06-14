import java.io.*;
import java.util.*;
public class PheonixAndBalance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            long w1=0;
            long w2=0;
            long b=0;
            for(long j=n;j>=1;j=j-2)
            {
                long h=(long)Math.pow(2,j);
                long g=(long)Math.pow(2,(j-1));
                if(j==n)
                {
                    b=Math.abs(g-h);
                    w1+=g;
                    w2+=h;
                    continue;
                }
                long e=Math.abs((w1+h)-(w2+g));
                long f=Math.abs((w1+g)-(w2+h));
                if(Math.min(Math.abs(b-e),Math.abs(b-f))==Math.abs(b-f))
                {
                    w1+=h;
                    w2+=g;
                    b=Math.abs(b-f);
                }
                else
                {
                    w1+=g;
                    w2+=h;
                    b=Math.abs(b-e);
                }
            }
            System.out.println((long)Math.abs(w1-w2));
        }
    }
}