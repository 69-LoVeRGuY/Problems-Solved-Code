import java.io.*;
import java.util.*;
public class RBubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
            a[i]=sc.nextInt();
        int b[]=bubble(a,0,1);
        for(int i=0;i<size;i++)
            System.out.print(b[i]+" ");
        System.out.println();
    }
    static int[] bubble(int arr[], int i, int n)
    {
        if(i<=arr.length-2)
        {
            if(arr[i]>arr[n])
            {
                int temp=arr[i];
                arr[i]=arr[n];
                arr[n]=temp;
            }
            if(n+1==arr.length)
            {
                i++;
                return bubble(arr,i,i+1);
            }
            else
                return bubble(arr,i,n+1);
        }
        else
            return arr;
    }
}