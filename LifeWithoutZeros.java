import java.io.*;
import java.util.*;
public class LifeWithoutZeros
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        String s1="",s2="",s3="";
        while(a>0)
        {
            int d=a%10;
            if(d!=0)
                s1=String.valueOf(d)+s1;
            a/=10;
        }
        while(b>0)
        {
            int d=b%10;
            if(d!=0)
                s2=String.valueOf(d)+s2;
            b/=10;
        }
        while(c>0)
        {
            int d=c%10;
            if(d!=0)
                s3=String.valueOf(d)+s3;
            c/=10;
        }
        int t1=Integer.parseInt(s1);
        int t2=Integer.parseInt(s2);
        int t3=Integer.parseInt(s3);
        int check=t1+t2;
        if(check==t3)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}