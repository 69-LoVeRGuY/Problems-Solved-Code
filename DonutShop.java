import java.io.*;
import java.util.*;
public class DonutShop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            if(a>=c)
                System.out.println(-1+" "+b);
            else if((a*b)<=c)
                System.out.println(b-1+" "+-1);
            else if((a*b)>c)
                System.out.println(1+" "+b);
        }
    }
}