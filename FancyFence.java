import java.io.*;
import java.util.*;
public class FancyFence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int sum=180-a;
            if(360%sum==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}