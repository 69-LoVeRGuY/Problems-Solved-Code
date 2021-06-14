import java.io.*;
import java.util.*;
public class RestoreSequence
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
            int z=4000000;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=n-1;i>=0;i--)
            {
                if(i==n-1)
                {
                    b[i]=z;
                    z--;
                }
                else
                {
                    if(a[i]==i+1)
                    {
                        b[i]=z;
                        z--;
                    }
                    else
                        b[i]=b[a[i]-1];
                }
            }
            for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}