import java.io.*;
import java.util.*;
public class Chips
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=1;
        while(m>=c)
        {
            m-=c;
            if(c==n)
                c=1;
            else
                c++;
        }
        System.out.println(m);
    }
}