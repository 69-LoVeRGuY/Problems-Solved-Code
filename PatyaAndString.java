import java.io.*;
import java.util.*;
public class PatyaAndString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        int f=s1.compareTo(s2);
        if(f==0)
            System.out.println(f);
        else if(f>0)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}