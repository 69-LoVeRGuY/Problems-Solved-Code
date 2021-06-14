import java.io.*;
import java.util.*;
public class StringTask
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' || ch=='y' || ch=='Y')
                continue;
           else
           {
               r=r+".";
               if(ch>=65 && ch<=90)
                    r=r+String.valueOf((char)(ch+32));
               else
                    r=r+String.valueOf(ch);
           }
        }
        System.out.println(r);
    }
}