import java.io.*;
import java.util.*;
public class LastYearSubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            if(s.substring(0,4).equals("2020") || (s.substring(0,3).equals("202") && s.substring((n-1),n).equals("0")) || (s.substring(0,2).equals("20") && s.substring((n-2),n).equals("20")) || (s.substring(0,1).equals("2") && s.substring((n-3),n).equals("020")) || s.substring((n-4),n).equals("2020"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}