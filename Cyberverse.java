import java.io.*;
import java.util.*;
public class Cyberverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ans=k/n;
            System.out.println(ans);
        }
    }
}