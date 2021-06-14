import java.io.*;
import java.util.*;
public class SumOfOddIntegers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int r=(int)Math.sqrt(n);
            if(n%2!=0 && k%2!=0)
            {
                if(k<=r)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else if(n%2==0 && k%2==0)
            {
                if(k<=r)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}