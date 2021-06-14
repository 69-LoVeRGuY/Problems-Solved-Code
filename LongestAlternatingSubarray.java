import java.io.*;
import java.util.*;
public class LongestAlternatingSubarray
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
       int l[]=new int[n];
       Arrays.fill(l,-1);
       l[n-1]=1;
       for(int i=n-2;i>=0;i--)
       {
           if((a[i]<0 && a[i+1]>0) || (a[i]>0 && a[i+1]<0))
               l[i]=1+l[i+1];
           else
               l[i]=1;
       }
       int max=-1,p=-1,c=0;
       for(int i=0;i<n;i++)
       {
           if(l[i]>max)
           {
               max=l[i];
               p=i;
           }
       }
       Arrays.sort(l);
       System.out.println(l[n-1]);
       for(int i=p;i<(p+l[n-1]);i++)
           System.out.print(a[i]+" ");
       System.out.println();
    }
}