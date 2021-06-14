import java.io.*;
import java.util.*;
public class SplitTheString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String r=String.valueOf(s.charAt(n-1));
            String z=s.substring(0,n-1);
            if(z.contains(r))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}