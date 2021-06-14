import java.io.*;
import java.util.*;
public class TheWayToHome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        String s=sc.next();
        int c=d,start=1,f=0,count=0;
        String r=s.substring(start,c+1);
        while(c<=n)
        {
            if(r.contains("1"))
            {
                int g=0;
                for(int i=r.length()-1;i>=0;i--)
                {
                    if(r.charAt(i)=='1')
                    {
                        start=c-g;
                        c=start+d;
                        count++;
                        break;
                    }
                    g++;
                }
                if(start==n-1)
                    break;
                if(c>=n)
                {
                    r=s.substring(start+1);
                    c=n-1;
                }
                else
                    r=s.substring(start+1,c+1);
            }
            else
            {
                f=-1;
                break;
            }
        }
        if(f==-1)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}