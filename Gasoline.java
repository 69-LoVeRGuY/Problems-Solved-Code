import java.io.*;
import java.util.*;
public class Gasoline
{
    public static class Distance 
    {
        static int dis;
        static int price;
        Distance(int dis, int price)
        {
            this.dis=dis;
            this.price=price;
        }
        static int getDistance()
        {
            return dis;
        }
        static int getPrice()
        {
            return price;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int f[]=new int[n];
            int c[]=new int[n];
            List<Distance> list=new ArrayList();
            for(int i=0;i<n;i++)
                f[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                c[i]=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(f[i]!=0)
                    list.add(new Distance(f[i],c[i]));
            }
            Collections.sort(list,new Comparator<Distance>() {
                public int compare(Distance d1, Distance d2)
                {
                    if(d1.price>d2.price)
                        return 1;
                    else if(d1.price<d2.price)
                        return -1;
                    else
                        return d1.dis>d2.dis? 1:-1;
                }
            });
            int count=0,i=0;
            long coin=0;
            while(count<n)
            {
                int a0=list.get(i).getDistance();
                int a1=list.get(i).getPrice();
                if(a0>=n-count)
                {
                    coin=coin+(long)((n-count)*a1);
                    break;
                }
                else
                {
                    coin=coin+(long)(a0*a1);
                    count+=a0;
                    i++;
                }
            }
            System.out.println(coin);
        }
    }
}