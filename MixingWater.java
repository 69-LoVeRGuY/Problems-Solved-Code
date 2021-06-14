import java.io.*;
import java.util.*;
public class MixingWater
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int h=sc.nextInt();
            int c=sc.nextInt();
            int t=sc.nextInt();
            int sum=0;
            int c1=0,g=1,sf=0;
            double diff=Integer.MAX_VALUE,f=0.0;
            while(g<100)
            {
                if(c1%2==0)
                {
                    sum+=h;
                    f++;
                    c1++;
                }
                else
                {
                    sum+=c;
                    f++;
                    c1++;
                }
                double x=sum/f;
                double y=Math.abs(t-x);
                if(y<=diff)
                {
                    diff=y;
                    sf=(int)f;
                }
                if(diff==0.0)
                    break;
                g++;
            }
            System.out.println(sf);
        }
    }
}