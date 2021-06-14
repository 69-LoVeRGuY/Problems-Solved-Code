import java.io.*;
import java.util.*;
public class DistanceAndAxis
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n==k)
                System.out.println(0);
            else if(k==0)
            {
                if(n%2==0)
                    System.out.println(0);
                else
                    System.out.println(1);
            }
            else
            {
                if(k>n)
                    System.out.println(k-n);
                else
                {
                    if(n%2!=0 && k%2!=0)
                        System.out.println(0);
                    else if(n%2!=0 && k%2==0)
                        System.out.println(1);
                    else if(n%2==0 && k%2==0)
                        System.out.println(0);
                    else
                        System.out.println(1);
                }
            }
        }
    }
}