import java.io.*;
import java.util.*;
public class ECF108A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long r=sc.nextLong();
            long b=sc.nextLong();
            long d=sc.nextLong();
            boolean ans=false;
            long min=(long)Math.min(r,b);
            long max=(long)Math.max(r,b);
            max-=min;
            if(max<=(min*d))
                ans=true;
            if(ans==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}