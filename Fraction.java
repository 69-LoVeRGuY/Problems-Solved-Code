import java.io.*;
import java.util.*;
public class Fraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                int num=i*(j+1);
                int den=(i+1)*j;
                if((num+1)==den)
                {
                    count++;
                    System.out.println(i+" "+j);
                }
            }
        }
        System.out.println(count);
    }
}