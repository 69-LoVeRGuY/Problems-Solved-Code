import java.io.*;
import java.util.*;
public class NewYearNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if((n%2020)%2021==0)
                System.out.println("YES");
            else if((n%2021)%2020==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}