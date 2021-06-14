import java.io.*;
import java.util.*;
public class Password
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int f=0,num=0,cap=0,small=0;
            if((s.charAt(0)>=97 && s.charAt(0)<=122 && s.charAt(s.length()-1)>=97 && s.charAt(s.length()-1)<=122) || (s.charAt(0)>=65 && s.charAt(0)<=90 && s.charAt(s.length()-1)>=65 && s.charAt(s.length()-1)<=90) || (s.charAt(0)>=65 && s.charAt(0)<=90 && s.charAt(s.length()-1)>=97 && s.charAt(s.length()-1)<=122) || (s.charAt(0)>=97 && s.charAt(0)<=122 && s.charAt(s.length()-1)>=65 && s.charAt(s.length()-1)<=90))
                f=0;
            else
                f=-1;
            if(f==0 && (s.contains("@") || s.contains("#") || s.contains("?") || s.contains("&") || s.contains("%")))
                f=0;
            else
                f=-1;   
            if(s.length()<10)
                f=-1;
            for(int i=1;i<s.length()-1;i++)
            {
                if(s.charAt(i)>=65 && s.charAt(i)<=90)
                    cap++;
                if(s.charAt(i)>=48 && s.charAt(i)<=57)
                    num++;
                if(s.charAt(i)>=97 && s.charAt(i)<=122)
                    small++;
            }
            if(num==0 || cap==0 || small==0)
                f=-1;
            if(f==-1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}