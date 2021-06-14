import java.io.*;
import java.util.*;
public class NonSubStringSubsequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            String s=sc.next();
            for(int i=0;i<q;i++)
            {
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                String last="",start="";
                if(r!=n-1)
                    last=s.substring(r+1);
                if(l!=0)
                    start=s.substring(0,l);
                if(last.contains(String.valueOf(s.charAt(r))) || start.contains(String.valueOf(s.charAt(l))))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
