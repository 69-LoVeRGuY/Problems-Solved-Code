import java.io.*;
import java.util.*;
public class ThreeSwimmers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long p=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long qa=p/a;
            if(qa*a<p)
                qa++;
            long qb=p/b;
            if(qb*b<p)
                qb++;
            long qc=p/c;
            if(qc*c<p)
                qc++;
            long dif1=(long)(Math.max((qa*a),p)-Math.min((qa*a),p));
            long dif2=(long)(Math.max((qb*b),p)-Math.min((qb*b),p));
            long dif3=(long)(Math.max((qc*c),p)-Math.min((qc*c),p));
            long ans=(long)(Math.min(dif1,Math.min(dif2,dif3)));
            System.out.println(ans);
        }
    }
}