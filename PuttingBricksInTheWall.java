import java.io.*;
import java.util.*;
public class PuttingBricksInTheWall
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            char a[][]=new char[n][n];
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                for(int j=0;j<n;j++)
                    a[i][j]=s.charAt(j);
            }
            if(a[0][1]=='0' && a[1][0]=='0')
            {
                if(a[n-1][n-2]=='0' && a[n-2][n-1]=='0')
                {
                    System.out.println(2);
                    System.out.println("1 2");
                    System.out.println("2 1");
                }
                else if(a[n-1][n-2]=='1' && a[n-2][n-1]=='1')
                    System.out.println(0);
                else
                {
                    System.out.println(1);
                    if(a[n-1][n-2]=='0')
                        System.out.println(n+" "+(n-1));
                    else
                        System.out.println((n-1)+" "+n);
                }
            }
            else if(a[0][1]=='1' && a[1][0]=='1')
            {
                if(a[n-1][n-2]=='1' && a[n-2][n-1]=='1')
                {
                    System.out.println(2);
                    System.out.println("1 2");
                    System.out.println("2 1");
                }
                else if(a[n-1][n-2]=='0' && a[n-2][n-1]=='0')
                    System.out.println(0);
                else
                {
                    System.out.println(1);
                    if(a[n-1][n-2]=='1')
                        System.out.println(n+" "+(n-1));
                    else
                        System.out.println((n-1)+" "+n);
                }
            }
            else
            {
                if(a[n-1][n-2]=='1' && a[n-2][n-1]=='1')
                {
                    System.out.println(1);
                    if(a[0][1]=='1')
                        System.out.println("1 2");
                    else
                        System.out.println("2 1");
                }
                else if(a[n-1][n-2]=='0' && a[n-2][n-1]=='0')
                {
                    System.out.println(1);
                    if(a[0][1]=='0')
                        System.out.println("1 2");
                    else
                        System.out.println("2 1");
                }
                else
                {
                    System.out.println(2);
                    if(a[n-1][n-2]=='1')
                        System.out.println(n+" "+(n-1));
                    else
                        System.out.println((n-1)+" "+n);
                    if(a[0][1]=='0')
                        System.out.println("1 2");
                    else
                        System.out.println("2 1");
                }
            }
        }
    }
}