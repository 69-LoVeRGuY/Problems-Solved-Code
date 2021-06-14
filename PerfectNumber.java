import java.io.*;
import java.util.*;
public class PerfectNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int s=0;
        for(int i=19;;i=i+9)
        {
            int sum=0,f=i;
            while(f>0)
            {
                int d=f%10;
                sum+=d;
                f=f/10;
            }
            if(sum==10)
                s++;
            if(s==k)
            {
                System.out.println(i);
                break;
            }
        }
    }
}