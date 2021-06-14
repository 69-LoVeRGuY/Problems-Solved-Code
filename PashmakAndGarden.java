import java.io.*;
import java.util.*;
public class PashmakAndGarden
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=0,y3=0,x4=0,y4=0,f=0;
        if(x1==x2 && y1==y2)
        {
            System.out.println(-1);
            System.exit(0);
        }
        if(x1==x2)
        {
            x3=x1+Math.abs(y2-y1);
            y3=y2;
            x4=x3;
            y4=y1;
            if(Math.abs(x4-x1)==Math.abs(y1-y2) && Math.abs(x3-x2)==Math.abs(y1-y2) && Math.abs(y3-y4)==Math.abs(x3-x2))
                f++;
        }
        else if(y1==y2)
        {
            x3=x2;
            x4=x1;
            y3=y1+Math.abs(x2-x1);
            y4=y3;
            if(Math.abs(y4-y1)==Math.abs(x2-x1) && Math.abs(y3-y2)==Math.abs(x2-x1) && Math.abs(x3-x4)==Math.abs(y3-y2))
                f++;
        }
        else
        {
            x3=x1;
            y3=y2;
            x4=x2;
            y4=y1;
            if(Math.abs(y3-y1)==Math.abs(x2-x3) && Math.abs(y2-y4)==Math.abs(x2-x3) && Math.abs(x4-x1)==Math.abs(y2-y4))
                f++;
        }
        if(f==0)
            System.out.println(-1);
        else
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}