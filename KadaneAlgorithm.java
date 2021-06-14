import java.io.*;
import java.util.*;
public class KadaneAlgorithm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        long max_so_far=Long.MIN_VALUE,max_ending_here=0L;
        for(int i=0;i<n;i++)
        {
            max_ending_here+=a[i];
            if(max_ending_here>max_so_far)
                max_so_far=max_ending_here;
            if(max_ending_here<0)
                max_ending_here=0;
        }
        System.out.println(max_so_far);
    }
}