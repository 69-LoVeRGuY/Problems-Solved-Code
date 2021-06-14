import java.io.*;
import java.util.*;
public class SelfDestructingString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int one=0,zero=0;
            int half=(s.length())/2;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    one++;
                else
                    zero++;
            }
            if(s.length()%2!=0)
                System.out.println("-1");
            else
            {
                int diff=0;
                if(one==half && zero==half)
                {
                    System.out.println(0);
                    continue;
                }
                if(one>half)
                    diff=one-half;
                else
                    diff=zero-half;
                System.out.println(diff);
            }
        }
    }
}