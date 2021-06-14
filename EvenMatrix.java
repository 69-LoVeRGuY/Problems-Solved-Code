import java.io.*;
import java.util.*;
public class EvenMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n%2!=0)
            {
                int a=0;
                while(a!=(n*n))
                {
                    a++;
                    System.out.print(a+" ");
                    if(a%n==0)
                        System.out.println();
                }
            }
            else
            {
                int a=1,b=n,c=n,f=1;
                while(a<=(n*n))
                {
                    if(f%2!=0)
                    {
                       System.out.print(b+" ");
                       b--;
                       if(b==a)
                       {
                           System.out.print(b);
                           a=(n*f)+1;
                           f++;
                           b=n*(f+1);
                           System.out.println();
                       }
                    }
                    else
                    {
                        System.out.print(a+" ");
                        if(a%n==0)
                        {
                            System.out.println();
                            f++;
                        }
                        a++;
                    }
                }
            }
        }
    }
}
 