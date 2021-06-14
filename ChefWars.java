import java.io.*;
import java.util.*;
public class ChefWars
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int h=sc.nextInt();
            int p=sc.nextInt();
            if((h-p)<=(p/2))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}