import java.io.*;
import java.util.*;
public class CF514C
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0,even=0,power=0,p=2,maxp=0;
        if(n==3)
        {
            System.out.println("1 1 3");
            System.exit(0);
        }
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                even++;
            else
                odd++;
            int pow=(int)Math.floor((Math.log(i)/Math.log(2)));
            int num=(int)Math.pow(2,pow);
            if(i==num && i!=1)
            {
                power++;
                if(num>maxp)
                    maxp=num;
            }
        }
        for(int i=0;i<odd;i++)
            System.out.print(1+" ");
        for(int i=0;i<(even-power);i++)
            System.out.print(2+" ");
        if(n%2==0 && n>maxp)
            power--;
        for(int i=0;i<power;i++)
        {
            System.out.print(p+" ");
            p*=2;
        }
        if(n%2==0 && n>maxp)
            System.out.println(n);
        else
            System.out.println(maxp);
    }
}