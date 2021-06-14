import java.io.*;
import java.util.*;
public class AccuratLee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int a=s.lastIndexOf('0');
            if(s.contains("0")==false || s.contains("1")==false)
            {
                System.out.println(s);
                continue;
            }
            int fo=-1;
            String r="";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1' && fo==-1 )
                {
                    fo=i;
                    r=r+s.substring(0,fo);
                    break;
                }
            }
            if(fo>a)
                System.out.println(s);
            else
            {
                r=r+s.substring(a);
                System.out.println(r);
            }
        }
    }
}