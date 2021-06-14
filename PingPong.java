import java.io.*;
import java.util.*;
public class PingPong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int alice=x-1;
            int bob=y;
            System.out.println(alice+" "+bob);
        }
    }
}