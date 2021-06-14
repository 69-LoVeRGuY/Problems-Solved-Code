import java.io.*;
import java.util.*;
public class AddCandies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            System.out.println(n-1);
            for(int i=2;i<=n;i++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}