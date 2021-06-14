import java.io.*;
import java.util.*;
public class TomAndJerryGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long ts=sc.nextLong();
            if(Math.ceil(Math.log(ts))==Math.floor(Math.log(ts)))
            {
                System.out.println(0);
                continue;
            }
            long js=ts & (~(ts - 1));
            js=(long)(ts/js);
            System.out.println(js/2);
        }
    }
}