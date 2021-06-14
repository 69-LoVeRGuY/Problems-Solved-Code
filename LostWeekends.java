import java.io.*;
import java.util.*;
public class LostWeekends
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a[]=new int[5];
            int sum=0;
            for(int i=0;i<5;i++)
            {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int p=sc.nextInt();
            if((sum*p)<=120)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}   