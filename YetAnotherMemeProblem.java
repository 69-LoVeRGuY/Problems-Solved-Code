import java.io.*;
import java.util.*;
public class YetAnotherMemeProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if((a<9 && b<9) || (a>b && b<9))
            {
                System.out.println(0);
                continue;
            }
            int bdigit=(int)(Math.log10(b))+1;
            long s=0;
            for(int i=1;i<=bdigit;i++)
                s=s*10+9;
            if(s==b)
            {
                long digit=(long)(Math.log10(b))+1;
                long result=a*digit;
                System.out.println(result);
                continue;
            }
            long digit=(long)(Math.log10(b));
            long result=a*digit;
            System.out.println(result);
        }
    }
}