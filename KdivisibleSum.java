import java.io.*;
import java.util.*;
public class KdivisibleSum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long v=(n/k)*k;
                if(n%k!=0) {
                	v+=k;
                }
                System.out.println((v+n-1)/n);
                
        }
    }
}            