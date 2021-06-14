import java.io.*;
import java.util.*;
public class FlipTheString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            int count=0;
            for(int i=0;i<a.length();i++)
            {
                if(i<=a.length()-3)
                {
                    if(a.charAt(i)!=b.charAt(i))
                    {
                        if(a.charAt(i+2)!=b.charAt(i+2))
                            continue;
                        else
                            count++;
                    }
                }
                if(i==a.length()-2 && a.charAt(i)!=b.charAt(i))
                    count++;
                if(i==a.length()-1 && a.charAt(i)!=b.charAt(i))
                    count++;
            }
            System.out.println(count);
        }
    }
}