import java.io.*;
import java.util.*;
public class ThiefAndPolice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int tx=sc.nextInt();
            int ty=sc.nextInt();
            int px=sc.nextInt();
            int py=sc.nextInt();
            int ps=Math.min(n-px,m-py);
            if(n-px<m-py)
                ps+=m-(py+ps);
            else
                ps+=n-(px+ps);
            int ts=2*Math.min(n-tx,m-ty);
            if(n-tx<m-ty)
                ts+=m-(ty+(ts/2));
            else
                ts+=n-(tx+(ts/2));
            if(ts<=ps)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}