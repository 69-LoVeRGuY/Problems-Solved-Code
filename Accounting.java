import java.io.*;
import java.util.*;
public class Accounting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        for(int i=-1000;i<=1000;i++)
        {
            if(a*((int)Math.pow(i,n))==b)
            {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("No solution");
    }
}