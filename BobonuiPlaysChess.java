import java.io.*;
import java.util.*;
public class BobonuiPlaysChess
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int xi=sc.nextInt();
        int yi=sc.nextInt();
        for(int i=yi;i<=m;i++)
            System.out.println(xi+" "+i);
        for(int i=yi-1;i>0;i--)
            System.out.println(xi+" "+i);
        int x=xi,y=0,z=xi-1,g=0;
        if(z%2==0)
        {
            int f=0;
            while(x!=1 || y!=1)
            {
                if(f%2==0)
                {
                    x-=1;
                    for(int i=1;i<=m;i++)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                else
                {
                    x-=1;
                    for(int i=m;i>0;i--)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                f++;
            }
        }
        else
        {
            int f=0;
            while(x!=1 || y!=m)
            {
                if(f%2==0)
                {
                    x-=1;
                    for(int i=1;i<=m;i++)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                else
                {
                    x-=1;
                    for(int i=m;i>0;i--)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                f++;
            }
            g++;
        }
        x=xi;
        int z1=n-xi;
        if(g==0 && z1%2!=0)
        {
            int f=0;
            while(x!=n || y!=m)
            {
                if(f%2==0)
                {
                    x+=1;
                    for(int i=1;i<=m;i++)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                else
                {
                    x+=1;
                    for(int i=m;i>0;i--)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                f++;
            }
        }
        else if(g==0 && z1%2==0)
        {
            int f=0;
            while(x!=n || y!=1)
            {
                if(f%2==0)
                {
                    x+=1;
                    for(int i=1;i<=m;i++)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                else
                {
                    x+=1;
                    for(int i=m;i>0;i--)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                f++;
            }
        }
        else if(g==1 && z1%2==0)
        {
            int f=0;
            while(x!=n || y!=m)
            {
                if(f%2==0)
                {
                    x+=1;
                    for(int i=m;i>0;i--)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                else
                {
                    x+=1;
                    for(int i=1;i<=m;i++)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                f++;
            }
        }
        else
        {
            int f=0;
            while(x!=n || y!=1)
            {
                if(f%2==0)
                {
                    x+=1;
                    for(int i=m;i>0;i--)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                else
                {
                    x+=1;
                    for(int i=1;i<=m;i++)
                    {
                        System.out.println(x+" "+i);
                        y=i;
                    }
                }
                f++;
            }
        }
    }
}