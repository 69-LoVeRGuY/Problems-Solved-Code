import java.io.*;
import java.util.*;
public class BearAndTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=Math.abs(x)+Math.abs(y);
        int x1=0,y1=0,x2=0,y2=0;
        if(x<0 && y<0)
        {
            x1=-ans;
            y1=0;
            x2=0;
            y2=-ans;
        }
        else if(x<0)
        {
            x1=-ans;
            y1=0;
            x2=0;
            y2=ans;
        }
        else if(y<0)
        {
            x1=0;
            y1=-ans;
            x2=ans;
            y2=0;
        }
        else
        {
            x1=0;
            y1=ans;
            x2=ans;
            y2=0;
        }
        System.out.println(x1+" "+y1+" "+x2+" "+y2);
    }
}