import java.io.*;
import java.util.*;
public class A693
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            if(w%2!=0 && h%2!=0 && n==1)
            {
                System.out.println("YES");
                continue;
            }
            int count=0;
            while(w%2==0 || h%2==0)
            {
                count++;
                if(w%2==0)
                    w=w/2;
                else if(h%2==0)
                    h=h/2;
            }
            long ans=(long)Math.pow(2,count);
            if(ans>=n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}