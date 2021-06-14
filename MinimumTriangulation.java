import java.io.*;
import java.util.*;
public class MinimumTriangulation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long area=0;
        int a=2;
        while(a+1<=n)
        {
            area+=(1*a*(a+1));
            a++;
        }
        System.out.println(area);
    }
}