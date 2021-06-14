import java.io.*;
import java.util.*;
public class IsolationCenter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            String s=sc.next();
            int f[]=new int[125];
            int c[]=new int[q];
            for(int j=0;j<q;j++)
            {
                c[j]=sc.nextInt();
            }
            for(int j=0;j<s.length();j++)
            {
                f[s.charAt(j)]++;
            }
            for(int j=0;j<q;j++)
            {
                int g[]=f.clone();
                int result=0;
                for(int k=97;k<=122;k++)
                {
                    if(g[k]-c[j]>0)
                        result+=g[k]-c[j];
                }
                System.out.println(result);
            }
        }
    }
}