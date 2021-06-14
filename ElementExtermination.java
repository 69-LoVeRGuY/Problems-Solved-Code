import java.io.*;
import java.util.*;
public class ElementExtermination
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
            if(n==1)
            {
                System.out.println("YES");
                continue;
            }
            if(a[0]==n || a[n-1]==1)
                System.out.println("NO");
            else if(a[0]>a[n-1])
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}