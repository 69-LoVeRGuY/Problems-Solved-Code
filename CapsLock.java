import java.io.*;
import java.util.*;
public class CapsLock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,u=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90)
                u++;
            else
                l++;
        }
        if((l==1 && u==(s.length()-1) && (s.charAt(0)>=97 && s.charAt(0)<=122))||(l==0 && u==s.length()))
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch>=65 && ch<=90)
                    System.out.print((char)(ch+32));
                else
                    System.out.print((char)(ch-32));
            }
            System.out.println();
        }
        else
            System.out.println(s);
    }
}