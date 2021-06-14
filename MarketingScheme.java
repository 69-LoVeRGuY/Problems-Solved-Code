import java.io.*;
import java.util.*;
public class MarketingScheme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long l=sc.nextLong();
            long r=sc.nextLong();
            if(r<(2*l))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}