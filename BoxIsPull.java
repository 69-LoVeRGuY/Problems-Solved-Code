import java.io.*;
import java.util.*;
public class BoxIsPull
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(x1==x2 || y1==y2)
                System.out.println(Math.max(Math.abs(x2-x1),Math.abs(y2-y1)));
            else
            {
                int ans=Math.abs(y2-y1)+Math.abs(x2-x1)+2;
                System.out.println(ans);
            }
        }
    }
}