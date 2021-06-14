import java.io.*;
import java.util.*;
public class ArrayRearrangement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                b[i]=sc.nextInt();
            int f=0;
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<n;i++)
            {
                if(a[i]+b[n-1-i]>x)
                {
                    f=-1;
                    break;
                }
            }
            if(f==-1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}