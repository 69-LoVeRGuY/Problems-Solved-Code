import java.io.*;
import java.util.*;
public class FillingShapes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0)
            System.out.println(0);
        else
        {
            int p=n/2;
            System.out.println((int)Math.pow(2,p));
        }
    }
}