import java.io.*;
import java.util.*;
public class RedBlueShuffle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String red=sc.next();
            String blue=sc.next();
            int r=0,b=0;
            for(int i=0;i<n;i++)
            {
                if(red.charAt(i)>blue.charAt(i))
                    r++;
                else if(red.charAt(i)<blue.charAt(i))
                    b++;
                else
                {
                    r++;
                    b++;
                }
            }
            if(r>b)
                System.out.println("RED");
            else if(b>r)
                System.out.println("BLUE");
            else
                System.out.println("EQUAL");
        }
    }
}