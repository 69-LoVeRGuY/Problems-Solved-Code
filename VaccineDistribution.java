import java.io.*;
import java.util.*;
public class VaccineDistribution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            int risk=0,free=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>=80 || a[i]<=9)
                    risk++;
                else
                    free++;
            }
            int riskdays=risk/d;
            if(risk>(d*riskdays))
                riskdays++;
            int freedays=free/d;
            if(free>(d*freedays))
                freedays++;
            System.out.println((riskdays+freedays));
        }
    }
}