import java.io.*;
import java.util.*;
public class GoodGrid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k<=n || k%n==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}