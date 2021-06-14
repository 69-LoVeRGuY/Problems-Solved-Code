import java.io.*;
import java.util.*;
public class CorrectSolution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String m=sc.next();
        String r="";
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            String ch=s.substring(i,i+1);
            a[i]=Integer.parseInt(ch);
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(i>0)
            {
                if(a[i-1]==0 && a[i]>0)
                    r=String.valueOf(a[i])+r;
                else
                    r=r+String.valueOf(a[i]);
            }
            else
                r=r+String.valueOf(a[i]);
        }
        if(r.equals(m))
            System.out.println("OK");
        else
            System.out.println("WRONG_ANSWER");
    }
}