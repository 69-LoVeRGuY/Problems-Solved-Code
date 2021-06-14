import java.io.*;
import java.util.*;
public class Queue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long wait=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(wait<=a[i])
            {
                wait+=a[i];
                c++;
            }
        }
        System.out.println(c);
    }
}