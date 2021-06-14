import java.io.*;
import java.util.*;
public class CF700A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String r="";
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                if(c%2==0)
                {
                    if(s.charAt(i)=='a')
                        r=r+"b";
                    else
                        r=r+"a";
                }
                else
                {
                    if(s.charAt(i)=='z')
                        r=r+"y";
                    else
                        r=r+"z";
                }
                c++;
            }
            System.out.println(r);
        }
    }
}