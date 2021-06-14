import java.io.*;
import java.util.*;
public class CaptainFlint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n<31)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                if(n-30==6)
                    System.out.println(5+" "+6+" "+10+" "+15);
                else if(n-30==10)
                    System.out.println(14+" "+6+" "+15+" "+5);
                else if(n-30==14)
                    System.out.println(21+" "+10+" "+6+" "+7);
                else
                    System.out.println(6+" "+10+" "+14+" "+(n-30));
            }
        }
    }
}