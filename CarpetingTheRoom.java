import java.io.*;
import java.util.*;
public class CarpetingTheRoom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int n1=sc.nextInt();
        int area=n*n;
        int c=n1*n1;
        if(k*c>=area)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}