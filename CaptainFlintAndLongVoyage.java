import java.io.*;
import java.util.*;
public class CaptainFlintAndLongVoyage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int e=0;
            if(n==1)
            {
                System.out.println(8);
                continue;
            }
            if(n%4==0)
                e=n/4;
            else
                e=(n/4)+1;
            for(int i=0;i<(n-e);i++)
                System.out.print(9);
            for(int i=0;i<e;i++)
                System.out.print(8);
            System.out.println();
        }
    }
}