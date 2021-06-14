import java.io.*;
import java.util.*;
public class Stairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long s=1L,sum=0L;
            int count=0;
            while(sum<n)
            {
                count++;
                sum=sum+(s*(s+1))/2;
                if(sum>n)
                    count--;
                s=(s*2)+1;
            }
            System.out.println(count);
        }
    }
}