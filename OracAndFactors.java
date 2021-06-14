import java.io.*;
import java.util.*;
public class OracAndFactors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%2==0)
            {
                int g=2;
                while(true)
                {
                    if(n%g==0)
                        break;
                    else
                        g++;
                }
                System.out.println(n+(k*g));
            }
            else
            {
                int g1=2,g2=2;
                while(true)
                {
                    if(n%g1==0)
                        break;
                    else
                        g1++;
                }
                n=n+g1;
                while(true)
                {
                    if(n%g2==0)
                        break;
                    else
                        g2++;
                }
                System.out.println(n+((k-1)*g2));
            }
        }
    }
}