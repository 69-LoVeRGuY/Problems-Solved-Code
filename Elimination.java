import java.io.*;
import java.util.*;
public class Elimination
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int result=0;
            if((Math.max(a,d)+Math.min(c,b))>(Math.max(c,b)+Math.min(a,d)))
                result=Math.max(a,d)+Math.min(c,b);
            else
                result=Math.max(c,b)+Math.min(a,d);
            System.out.println(result);
        }
    }
}