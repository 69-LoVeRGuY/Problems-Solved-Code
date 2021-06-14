import java.io.*;
import java.util.*;
public class Dragons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp1=a[i];
                    int temp2=b[i];
                    a[i]=a[j];
                    a[j]=temp1;
                    b[i]=b[j];
                    b[j]=temp2;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<s)
            {
                count++;
                s=s+b[i];
            }
            else
                break;
        }
        if(count==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}