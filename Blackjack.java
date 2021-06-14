import java.io.*;
import java.util.*;
public class Blackjack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]={0,4,4,4,4,4,4,4,4,4,15,4};
        int diff=n-10;
        if(diff>=0 && diff<=11)
            System.out.println(a[diff]);
        else
            System.out.println(0);
    }
}