import java.io.*;
import java.util.*;
public class Polycarp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            for(int i=1;i<10;i++)
            {
                long x=0;
                while(x<=n)
                {
                    x=x*10+i;
                    if(x<=n)
                        c++;
                }
            }
            System.out.println(c);
        }
    }
}