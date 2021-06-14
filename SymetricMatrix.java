import java.io.*;
import java.util.*;
public class SymetricMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int f=0;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                if((a==b && b==c && c==d && d==a) || (a==d && b==c) || (b==c && a!=d))
                    f=1;
            }
            if(m%2!=0)
                System.out.println("NO");
            else if(f==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}