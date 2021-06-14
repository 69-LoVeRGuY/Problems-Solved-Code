import java.io.*;
import java.util.*;
public class SubtractOrDivide
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            if(n==1)
            {
                System.out.println(0);
                continue;
            }
            if(n==2)
            {
                System.out.println(1);
                continue;
            }
            if(n%2==0 || n==3)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}