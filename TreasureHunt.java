import java.io.*;
import java.util.*;
public class TreasureHunt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int d1=Math.max(x1,x2)-Math.min(x1,x2);
        int d2=Math.max(y1,y2)-Math.min(y1,y2);
        int r1=d1/x;
        int r2=d2/y;
        if(x1==x2 && y1==y2)
            System.out.println("YES");
        else if(x1==x2 && d2%y==0 && (d2/y)%2==0)
            System.out.println("YES");
        else if(y1==y2 && d1%x==0 && (d1/x)%2==0)
            System.out.println("YES");
        else if(d1%x==0 && d2%y==0 && r1==r2)
            System.out.println("YES");
        else if(d1%x==0 && d2%y==0 && (Math.max(r1,r2)-Math.min(r1,r2))%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}