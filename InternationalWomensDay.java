import java.io.*;
import java.util.*;
public class InternationalWomensDay
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[k];
        Arrays.fill(a,0);
        int count=0;
        for(int i=0;i<n;i++)
        {
            int b=sc.nextInt();
            a[b%k]++;
        }
        count=count+(a[0]/2);
        int i=1,j=k-1;
        while(i<=j)
        {
            if(i==j)
                count=count+(a[i]/2);
            else
                count=count+Math.min(a[i],a[j]);
            i++;
            j--;
        }
        System.out.println(count*2);
    }
}