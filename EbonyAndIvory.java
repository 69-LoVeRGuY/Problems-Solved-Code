import java.io.*;
import java.util.*;
public class EbonyAndIvory
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(c<Math.min(a,b))
            System.out.println("No");
        else if(c%a==0 || c%b==0)
            System.out.println("Yes");
        else
        {
            int f=0;
            int n=c;
            while(n>0)
            {
                if((n)%b==0)
                {
                    f=1;
                    break;
                }
                else
                    n=n-a;
            }
            if(f==1)
                System.out.println("Yes");
            else
            {
                while(c>0)
                {
                    if((c)%a==0)
                    {
                        f=1;
                        break;
                    }
                    else
                        c=c-b;
                }
                if(f==1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}