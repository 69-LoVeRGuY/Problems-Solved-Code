import java.io.*;
import java.util.*;
public class MostUnstableArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n==1)
            {
                System.out.println(0);
                continue;
            }
            if(n==2)
            {
                System.out.println(m);
                continue;
            }
            System.out.println(m*2);
        }
    }
}