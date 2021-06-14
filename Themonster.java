import java.io.*;
import java.util.*;
public class Themonster
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(d<b)
        {
            int temp1=b;
            b=d;
            d=temp1;
            int temp2=a;
            a=c;
            c=temp2;
        }
        int f=Math.max(a,b),g=Math.max(c,d),h=Math.max(f,g),i=1,ans=-1;
        if(b==d)
        {
            System.out.println(b);
            System.exit(0);
        }
        while(i<=h)
        {
            double j=((a*i)+b-d)/(double)c;
            double e=Math.floor(j);
            if(j==e && j>=0)
            {
                ans=(a*i)+b;
                break;
            }
            else
                i++; 
        }
        System.out.println(ans);
    }
}
