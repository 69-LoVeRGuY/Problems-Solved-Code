import java.io.*;
import java.util.*;
public class CPlusEqualTo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int count=0;
            while(a<=n && b<=n)
            {
                if(Math.max(a,b)==b)
                {
                    a=a+b;
                    b=Math.min(a,b);
                }
                else
                {
                    b=b+a;
                    a=Math.min(a,b);
                }
                count++;
            }
            System.out.println(count);
        }
    }
}