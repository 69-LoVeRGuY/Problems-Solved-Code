import java.io.*;
import java.util.*;
public class ChefOnIsland
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int xr=sc.nextInt();
            int yr=sc.nextInt();
            int d=sc.nextInt();
            int xc=xr*d;
            int yc=yr*d;
            if(xc<=x && yc<=y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}