import java.io.*;
import java.util.*;
public class CF702A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int count=0,i=0;
            while(i<n-1)
            {
                if(a[i]<a[i+1] && (2*a[i]<a[i+1]))
                {
                    int f=a[i];
                    while(2*f<a[i+1])
                    {
                        count++;
                        f*=2;
                    }
                }
                else if(a[i+1]<a[i] && (2*a[i+1]<a[i]))
                {
                    int f=a[i+1];
                    while(2*f<a[i])
                    {
                        count++;
                        f*=2;
                    }
                }
                i++;
            }
            System.out.println(count);
        }
    }
}