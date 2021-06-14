import java.io.*;
import java.util.*;
public class Username
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0,min=0,count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i==0)
            {
                max=a[i];
                min=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
                count++;
            }
            else if(a[i]>max)
            {
                max=a[i];
                count++;
            }
        }
        System.out.println(count);
    }
}