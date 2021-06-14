import java.io.*;
import java.util.*;
public class Translation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        StringBuilder b=new StringBuilder();
        b.append(s);
        b=b.reverse();
        String x=String.valueOf(b);
        if(x.equals(t))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}