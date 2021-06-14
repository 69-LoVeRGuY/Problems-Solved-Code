import java.io.*;
import java.util.*;
public class ChristmasOrnaments
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        if(y+2<=r && y+1<=b)
            System.out.println(y+y+1+y+2);
        else if(r-2<=y && r-1<=b)
            System.out.println(r+r-1+r-2);
        else 
            System.out.println(b+b-1+b+1);
    }
}