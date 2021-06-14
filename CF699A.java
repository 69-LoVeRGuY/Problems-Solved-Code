import java.io.*;
import java.util.*;
public class CF699A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            String s=sc.next();
            int fx=0,fy=0,u=0,d=0,l=0,r=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='U')
                {
                    u++;
                    fy+=1;
                }
                else if(s.charAt(i)=='D')
                {
                    d++;
                    fy-=1;
                }
                else if(s.charAt(i)=='R')
                {
                    r++;
                    fx+=1;
                }
                else
                {
                    l++;
                    fx-=1;
                }
            }
            if(x>=0)
            {
                if(r>=x && y>=0 && u>=y)
                    System.out.println("YES");
                else if(r>=x && y<0 && d>=Math.abs(y))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
            {
                if(l>=Math.abs(x) && y>=0 && u>=y)
                    System.out.println("YES");
                else if(l>=Math.abs(x) && y<0 && d>=Math.abs(y))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}