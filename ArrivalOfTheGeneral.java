import java.io.*;
import java.util.*;
public class ArrivalOfTheGeneral
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,maxpos=-1,minpos=-1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
                maxpos=i;
            }
            if(a[i]<=min)
            {
                min=a[i];
                minpos=i;
            }
        }
        if(maxpos==0 && minpos==n-1)
            System.out.println("0");
        else if(maxpos==0 && minpos!=n-1)
            System.out.println((n-1-minpos));
        else if(maxpos!=0 && minpos==n-1)
            System.out.println(maxpos);
        else if((maxpos!=0 && minpos!=n-1) && (maxpos<minpos))
            System.out.println((maxpos+(n-1-minpos)));
        else
            System.out.println((maxpos+(n-1-minpos)-1));
    }
}