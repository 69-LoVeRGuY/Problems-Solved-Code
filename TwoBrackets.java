import java.io.*;
import java.util.*;
public class TwoBrackets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int a[]=new int[2];
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='(')
                    a[0]++;
                else if(ch=='[')
                    a[1]++;
                else
                {
                    if(ch==')' && a[0]>0)
                    {
                        count++;
                        a[0]--;
                    }
                    else if(ch==']' && a[1]>0)
                    {
                        count++;
                        a[1]--;
                    }
                }
            }
            System.out.println(count);
        }
    }
}