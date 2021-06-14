import java.io.*;
import java.util.*;
public class TwoKnights
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=1;i<=n;i++)
        {
            long ans=(((i*i)*((i*i)-1))/2)-(4*(i-1)*(i-2));
            System.out.println(ans);
        }
    }
}