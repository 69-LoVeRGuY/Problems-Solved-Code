import java.io.*;
import java.util.*;
public class ALT_A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int l=sc.nextInt();
            String s=sc.next();
            int b=0,g=0,tot=0;
            for(int i=0;i<l;i++)
            {
                if(s.charAt(i)=='1')
                    g++;
                else
                    b++;
                if(g>=b)
                {
                    tot++;
                    break;
                }
            }
            if(tot>0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}