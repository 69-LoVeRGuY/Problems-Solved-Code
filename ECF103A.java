import java.io.*;
import java.util.*;
public class ECF103A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int odd=0,even=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                    even++;
                else
                    odd++;
            }
            if(odd%2==1)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
}