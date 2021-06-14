import java.io.*;
import java.util.*;
public class XorCompare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            int count=0;
            for(int i=0;i<=n;i++)
            {
                if((x^i)<(y^i))
                    count++;
            }
            System.out.println(count);
        }
    }
}