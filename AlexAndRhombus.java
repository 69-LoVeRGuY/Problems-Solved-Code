import java.io.*;
import java.util.*;
public class AlexAndRhombus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int c=0;
        if(n==1)
        {
            System.out.println(1);
            System.exit(0);
        }
        a[1]=1;
        a[2]=5;
        for(int i=3;i<=n;i++)
        {
            a[i]=a[i-1]+2+(3*2)+(c*4);
            c++;
        }
        System.out.println(a[n]);
    }
}