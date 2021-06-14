import java.io.*;
import java.util.*;
public class FindingSasuke
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(a[(n-1)-i]>0 && i<(n/2))
                    b[i]=-a[(n-1)-i];
                else if(a[(n-1)-i]>0 && i>=(n/2))
                    b[i]=a[(n-1)-i];
                else if(a[(n-1)-i]<0 && i<(n/2))
                    b[i]=-a[(n-1)-i];
                else
                    b[i]=a[(n-1)-i];
            }
            for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}