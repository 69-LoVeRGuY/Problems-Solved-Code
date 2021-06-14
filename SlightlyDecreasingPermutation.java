import java.io.*;
import java.util.*;
public class SlightlyDecreasingPermutation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int c=n,start=k,end=n-1;
        for(int i=0;i<n;i++)
        {
            a[i]=c;
            c--;
        }
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}