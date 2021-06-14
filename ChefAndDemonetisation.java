import java.io.*;
import java.util.*;
public class ChefAndDemonetisation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int s=sc.nextInt();
            int n=sc.nextInt();
            if(s==1)
                System.out.println(1);
            else if(s<=n)
            {
                if(s%2==0)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            else
            {
                int a=s/n;
                int r=s%n;
                if(r==0)
                    System.out.println(a);
                else if(r%2==0)
                    System.out.println(a+1);
                else if(r%2!=0 && r!=0)
                {
                    if(r==1)
                        System.out.println(a+1);
                    else
                        System.out.println(a+2);
                }
            }
        }
    }
}