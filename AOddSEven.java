import java.io.*;
import java.util.*;
public class AOddSEven
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
                System.out.println(0);
            else if(a<b)
            {
                int s=b-a;
                if(s%2!=0)
                    System.out.println(1);
                else 
                    System.out.println(2);
            }
            else
            {
                int s=a-b;
                if(s%2==0)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
        }
    }
}