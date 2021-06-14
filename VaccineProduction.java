import java.io.*;
import java.util.*;
public class VaccineProduction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int v1=sc.nextInt();
        int d2=sc.nextInt();
        int v2=sc.nextInt();
        int p=sc.nextInt();
        int count=0,sum=0;
        while(sum<p)
        {
            count++;
            if(count>=d1)
               sum=sum+v1;
            if(count>=d2)
                sum=sum+v2;
        }
        System.out.println(count);
    }
}