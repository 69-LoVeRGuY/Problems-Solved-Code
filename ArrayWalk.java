import java.io.*;
import java.util.*;
public class ArrayWalk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int z=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            long sum=a[0];
            int f=0,b=0,i=0,c=0;
            while(f<k)
            {
                if(i>0 && a[i-1]>a[i+1] && b<z && c==0)
                {
                    sum+=a[i-1];
                    i=i-1;
                    b++;
                    f++;
                    c++;
                }
                else
                {
                    sum+=a[i+1];
                    i=i+1;
                    f++;
                    c=0;
                }
            }
            System.out.println(sum);
        }
    }
}