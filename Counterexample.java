import java.io.*;
import java.util.*;
public class Counterexample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        long ans=0;
        int c=-1;
        if(r-l<2 || ((r-l)==2 && r%2!=0))
        {
            System.out.println(-1);
            System.exit(0);
        }
        if(l%2==0)
            System.out.println(l+" "+(l+1)+" "+(l+2));
        else
            System.out.println((l+1)+" "+(l+2)+" "+(l+3));
    }
}