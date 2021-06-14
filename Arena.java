import java.io.*;
import java.util.*;
public class Arena
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int c=0,i=0;
            while(a[i]==a[0])
            {
                c++;
                i++;
                if(i==a.length)
                    break;
            }
            System.out.println((a.length-c));
        }
    }
}