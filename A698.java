import java.io.*;
import java.util.*;
public class A698
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int freq[]=new int[101];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                freq[a[i]]++;
                if(freq[a[i]]>max)
                    max=freq[a[i]];
            }
            System.out.println(max);
        }
    }
}