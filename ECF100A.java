import java.io.*;
import java.util.*;
public class ECF100A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a+b+c;
            int q=sum/7;
            if(a<q || b<q || c<q)
            {
                System.out.println("NO");
                continue;
            }
            int num=(7*q)-q;
            int diff=(a-q)+(b-q)+(c-q);
            if(diff==num)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}