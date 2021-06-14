import java.io.*;
import java.util.*;
public class CF701A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b)
                System.out.println(2);
            else if(b>a)
                System.out.println(1);
            else
            {
                int count=0;
                int diff=a-b+1;
                if(b==1)
                {
                    b=3;
                    count+=2;
                }
                while(a>=b)
                {
                    count++;
                    a=a/b;
                }
                if(a!=0)
                    count++;
                System.out.println(Math.min(diff,count));
            }
        }
    }
}