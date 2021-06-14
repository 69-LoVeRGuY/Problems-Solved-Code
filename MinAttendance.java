import java.io.*;
import java.util.*;
public class MinAttendance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int diff=120-n;
            String s=sc.next();
            for(int i=0;i<diff;i++)
                s=s+"1";
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    count++;
            }
            if(count>=90)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}