import java.io.*;
import java.util.*;
public class MinimalSquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=Math.min(a,b);
            int d=Math.max(a,b);
            if(c*2>=d)
            {
                int e=(int)Math.pow((c*2),2);
                System.out.println(e);
            }
            else
            {
                int e=(int)Math.pow(d,2);
                System.out.println(e);
            }
        }
    }
}