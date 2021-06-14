import java.io.*;
import java.util.*;
public class ThreePairwiseMaximums
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x==y && y==z)
            {
                System.out.println("YES");
                System.out.println(x+" "+x+" "+x);
            }
            else if(y==z && x<y)
            {
                System.out.println("YES");
                System.out.println(y+" "+x+" "+1);
            }
            else if(x==y && z<x)
            {
                System.out.println("YES");
                System.out.println(x+" "+z+" "+1);
            }
            else if(x==z && y<z)
            {
                System.out.println("YES");
                System.out.println(x+" "+y+" "+1);
            }
            else
                System.out.println("NO");
        }
    }
}