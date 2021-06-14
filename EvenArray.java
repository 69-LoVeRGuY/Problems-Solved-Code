import java.io.*;
import java.util.*;
public class EvenArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int c=0,d=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0 && i%2!=0)
                    c++;
                if(a[i]%2!=0 && i%2==0)
                    d++;
            }
            if(d==c)
                System.out.println(c);
            else 
                System.out.println(-1);
        }
    }
}