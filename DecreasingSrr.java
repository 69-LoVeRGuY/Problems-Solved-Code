import java.io.*;
import java.util.*;
public class DecreasingSrr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(r<(2*l))
                System.out.println(r);
            else
                System.out.println(-1);
        }
    }
}