import java.io.*;
import java.util.*;
public class StringLCM
{
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0)
        {
            String s1=sc.next();
            String s2=sc.next();
            int lcm=(s1.length()*s2.length())/gcd(s1.length(),s2.length());
            int m1=lcm/s1.length();
            int m2=lcm/s2.length();
            String r1="",r2="";
            for(int i=0;i<m1;i++)
                r1=r1+s1;
            for(int i=0;i<m2;i++)
                r2=r2+s2;
            if(r1.equals(r2))
                System.out.println(r1);
            else 
                System.out.println("-1");
        }
    }
}