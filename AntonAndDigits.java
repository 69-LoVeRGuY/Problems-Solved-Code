import java.io.*;
import java.util.*;
public class AntonAndDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int result=0;
        int k2=sc.nextInt();
        int k3=sc.nextInt();
        int k5=sc.nextInt();
        int k6=sc.nextInt();
        int a=Math.min(Math.min(k2,k5),k6);
        result+=a*256;
        k2-=a;
        k5-=a;
        k6-=a;
        result+=Math.min(k2,k3)*32;
        System.out.println(result);
    }
}   