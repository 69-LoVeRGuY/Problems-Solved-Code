import java.io.*;
import java.util.*;
import java.math.*;
public class BadUglyNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            String s="";
            if(n==1)
            {
                System.out.println("-1");
                continue;
            }
            else
            {
                for(int j=0;j<n-1;j++)
                {
                    s=s+"9";
                }
                System.out.println(s+"8");
            }
        }
    }
}       