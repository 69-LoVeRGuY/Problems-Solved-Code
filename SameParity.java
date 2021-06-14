import java.io.*;
import java.util.*;
public class SameParity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k>n)
            {
                System.out.println("NO");
                continue;
            }
            if(n==k)
            {
                System.out.println("YES");
                for(int i=1;i<=n;i++)
                    System.out.print(1+" ");
                System.out.println();
                continue;
            }
            else
            {
                int a1=0,b1=0,a2=0,b2=0;
                a1=2*(k-1);
                b1=n-a2;
                a2=(k-1);
                b2=n-a2;
                if(b1%2==0 && b1>0 && a1+b1==n)
                {
                    System.out.println("YES");
                    for(int i=1;i<=k-1;i++)
                        System.out.print(2+" ");
                    System.out.println(b1);
                }
                if(b2%2!=0 && b2>0 && a2+b2==n)
                {
                    System.out.println("YES");
                    for(int i=1;i<=k-1;i++)
                        System.out.print(1+" ");
                    System.out.println(b2);
                }
                else
                    System.out.println("NO");
            }
            
        }
    }
}