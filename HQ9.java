import java.io.*;
import java.util.*;
public class HQ9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<33 || s.charAt(i)>126)
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9')
            {
                f++;
                break;
            }
        }
        if(f>0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}