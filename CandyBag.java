import java.io.*;
import java.util.*;
public class CandyBag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n/2;
        int a[]=new int[(n*n)+1];
        for(int i=1;i<=(n*n);i++)
            a[i]=i;
        int start=1,end=(n*n);
        for(int i=0;i<n;i++)
        {
            int count=0;
            while(count<mid)
            {
                System.out.print(a[start]+" "+a[end]+" ");
                start++;
                end--;
                count++;
            }
            System.out.println();
        }
    }
}