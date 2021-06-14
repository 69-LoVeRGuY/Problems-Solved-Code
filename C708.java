import java.io.*;
import java.util.*;
public class C708
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%2==1)
            {
                System.out.println(1+" "+(n/2)+" "+(n/2));
                continue;
            }
            if((n/2)%2==0)
            {
                if(n%3==0)
                    System.out.println((n/3)+" "+(n/3)+" "+(n/3));
                else
                    System.out.println(4+" "+((n/2)-2)+" "+((n/2)-2));
            }
            else
                System.out.println(2+" "+((n/2)-1)+" "+((n/2)-1));
        }
    }
}