import java.io.*;
import java.util.*;
public class RequiredRemainder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            int q=n/x;
            int r=n%x;
            if(r==y)
                System.out.println(n);
            else if(r<y)
            {
                int p=(q*x)-x+y;
                System.out.println(p);
            }
            else
                System.out.println(n-(r-y));
        }
    }
}