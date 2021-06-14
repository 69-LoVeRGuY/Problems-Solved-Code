import java.io.*;
import java.util.*;
public class TowerOfHanoi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbe rof discs");
        int n=sc.nextInt();
        int a[]=new int[n+1];
        a[1]=1;
        for(int i=2;i<=n;i++)
            a[i]=(int)Math.pow(2,(i-1))+a[i-1];
        System.out.println("Number of moves required are="a[n]);
    }
}