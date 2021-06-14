import java.io.*;
import java.util.*;
public class ShortSubstrings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            if(s.length()==2)
            {
                System.out.println(s);
                continue;
            }
            String x="";
            int i=0;
            while(i<s.length()-1)
            {
                if(i==0)
                {
                    x=x+s.charAt(0)+s.charAt(1);
                    i+=2;
                }
                else
                {
                    if(s.charAt(i)==s.charAt(i-1))
                    {
                        x=x+s.charAt(i+1);
                        i+=2;
                    }
                    else
                    {
                        x=x+s.charAt(i)+s.charAt(i+1);
                        i+=2;
                    }
                }
            }
            System.out.println(x);
        }
    }
}