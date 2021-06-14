import java.io.*;
import java.util.*;
public class RestrictedRPS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            String s=sc.next();
            char r[]=new char[n];
            int count=0,f=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='R' && b>0)
                {
                    r[f]='P';
                    b--;
                    count++;
                }
                else if(s.charAt(i)=='P' && c>0)
                {
                    r[f]='S';
                    c--;
                    count++;
                }
                else if(s.charAt(i)=='S' && a>0)
                {
                    r[f]='R';
                    a--;
                    count++;
                }
                else
                    r[f]=' ';
                f++;
            }
            for(int i=0;i<n;i++)
            {
                if(r[i]==' ')
                {
                    if(a>0)
                    {
                       r[i]='R';
                       a--;
                    }
                    else if(b>0)
                    {
                        r[i]='P';
                        b--;
                    }
                    else if(c>0)
                    {
                        r[i]='S';
                        c--;
                    }
                }
            }
            if(count>=(int)Math.ceil(n/(double)2))
            {
                System.out.println("YES");
                for(int i=0;i<n;i++)
                    System.out.print(r[i]);
                System.out.println();
            }
            else
                System.out.println("NO");
        }
    }
}