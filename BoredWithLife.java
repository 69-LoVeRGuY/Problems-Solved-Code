import java.io.*;
import java.util.*;
import java.math.*;
public class BoredWithLife
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int result=1;
        int a=Math.min(x,y);
        for(int i=2;i<=a;i++)
            result*=i;
        System.out.println(result);
    }
}
