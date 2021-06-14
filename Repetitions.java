import java.io.*;
import java.util.*;
public class Repetitions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=Integer.MIN_VALUE,len=0;
        char prev='?';
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                prev=s.charAt(0);
                len++;
                continue;
            }
            char ch=s.charAt(i);
            if(ch==prev)
                len++;
            else
            {
                prev=ch;
                if(len>max)
                    max=len;
                len=1;
            }
        }
        max=Math.max(max,len);
        System.out.println(max);
    }
}