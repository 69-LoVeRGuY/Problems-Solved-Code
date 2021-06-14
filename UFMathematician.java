import java.io.*;
import java.util.*;
public class UFMathematician
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String ans="";
        for(int i=0;i<s1.length();i++)
        {
            if((s1.charAt(i)=='1' && s2.charAt(i)=='0') || (s1.charAt(i)=='0' && s2.charAt(i)=='1'))
                ans=ans+"1";
            else
                ans=ans+"0";
        }
        System.out.println(ans);
    }
}