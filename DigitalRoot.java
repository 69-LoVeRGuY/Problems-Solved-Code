import java.io.*;
import java.util.Scanner;
public class DigitalRoot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            long k=sc.nextLong();
            int x=sc.nextInt();
            if(k==1)
                System.out.println(x);
            else
                System.out.println(x+(9*(k-1)));
        }
    }
}