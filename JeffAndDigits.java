import java.io.*;
import java.util.*;
public class JeffAndDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int five=0,zero=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==5)
                five++;
            else
                zero++;
        }
        if(five<9 || zero==0)
        {
            if(zero==0)
                System.out.println(-1);
            else
                System.out.println(0);
            System.exit(0);
        }
        if(five%9==0)
        {
            for(int i=0;i<five;i++)
                System.out.print(5);
            for(int i=0;i<zero;i++)
                System.out.print(0);
            System.out.println();
        }
        else
        {
            int r=five/9;
            for(int i=0;i<r*9;i++)
                System.out.print(5);
            for(int i=0;i<zero;i++)
                System.out.print(0);
            System.out.println();
        }
    }
}