import java.io.*;
import java.util.*;
public class ChefAndDice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long sum=0;
            long q=n/4;
            if(q>0)
                sum=sum+((q-1)*11);
            long mod=n%4;
            if(mod==0)
                sum=sum+24+36;
            else if(mod==1)
            {
                sum=sum+20;
                if(q>0)
                    sum=sum+18+27+11;
            }
            else if(mod==2)
            {
                sum+=36;
                if(q>0)
                    sum=sum+12+18+22;
            }
            else
            {
                sum+=18+15+18;
                if(q>0)
                    sum+=6+9+33;
            }
            System.out.println(sum);
        }
    }
}