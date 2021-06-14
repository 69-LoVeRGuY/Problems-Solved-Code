import java.io.*;
import java.util.*;
public class ParkLighting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int lights=0;
            if(n==1 && m==1)
            {
                System.out.println(1);
                continue;
            }
            if(n%2==0)
            {
               lights=lights+((n/2)*m);
            }
            else
            {
                lights=lights+((n/2)*m);
                if(m%2==0)
                    lights=lights+(m/2);
                else
                    lights=lights+((m/2)+1);
            }
            System.out.println(lights);
        }
    }
}