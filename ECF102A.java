import java.io.*;
import java.util.*;
public class ECF102A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>d)
                    c++;
            }
            int b[]=a.clone();
            Arrays.sort(b);
            int sum=b[0]+b[1];
            if(c>0 && sum<=d)
                System.out.println("YES");
            else if(c>0 && sum>d)
                System.out.println("NO");
            else if(c==0)
                System.out.println("YES");
        }
    }
}