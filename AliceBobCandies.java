import java.io.*;
import java.util.*;
public class AliceBobCandies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int p1=0,p2=n-1,ls=0,c=0,aw=0,moves=0;
            long as=0,bs=0;
            while(p1<=p2)
            {
                if(p1==0)
                {
                    ls=a[p1];
                    c++;
                    as=as+a[p1];
                    p1++;
                    moves++;
                }
                else
                {
                    if(c%2==0)
                    {
                        if(aw<=ls)
                        {
                            aw=aw+a[p1];
                            as+=a[p1];
                            p1++;
                            if(aw>ls)
                            {
                                ls=aw;
                                aw=0;
                                c++;
                                moves++;
                            }
                        }
                    }
                    else
                    {
                        if(aw<=ls)
                        {
                            aw=aw+a[p2];
                            bs+=a[p2];
                            p2--;
                            if(aw>ls)
                            {
                                ls=aw;
                                aw=0;
                                c++;
                                moves++;
                            }
                        }
                    }
                }
            }
            if(aw<=ls && aw!=0)
                moves++;
            System.out.print(moves+" "+as+" "+bs);
            System.out.println();
        }
    }
}