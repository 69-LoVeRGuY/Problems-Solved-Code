import java.io.*;
import java.util.*;
public class WizardsAndDemonstration
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        double r= Math.ceil(n*(y/(double)100));
        int more=(int)r;
        int ans=more-x;
        if(ans>=0)
            System.out.println((more-x));
        else
            System.out.println(0);
    }
}