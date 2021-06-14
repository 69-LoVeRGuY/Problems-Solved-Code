import java.io.*;
import java.util.*;
public class CF710A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        long n=sc.nextLong();
        long m=sc.nextLong();
        long x=sc.nextLong();
        long r=x/n;
        long row=x-(r*n);
        long col=r+1;
        if(row==0)
        {
            row=r;
            col--;
        }
        long ans=0;
        if(row-1>=0)
            ans=(m*(row-1))+col;
        else
            ans=(m*(x-1))+col;
        System.out.println(ans);
    }}
}