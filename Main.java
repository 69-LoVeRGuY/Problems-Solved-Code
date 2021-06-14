import java.util.*;
import java.io.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int f=0;
        long max[]=new long[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                max[i]=a[i];
                f=1;
                continue;
            }
            if(i==1)
            {
                max[i]=max[i-1]+a[i];
                f=2;
                continue;
            }
            if(f==0 || f==1)
            {
                max[i]=max[i-1]+a[i];
                f++;
            }
            else
            {
                long temp1=max[i-2]+a[i];
                long temp2=0;
                if(i>3)
                    temp2=max[i-3]+a[i]+a[i-1];
                else
                    temp2=a[i]+a[i-1];
                if(temp1>=temp2 && temp1>max[i-1])
                {
                    max[i]=temp1;
                    f=1;
                }
                else if(temp2>temp1 && temp2>max[i-1])
                {
                    max[i]=temp2;
                    f=2;
                }
                else    
                {
                    max[i]=max[i-1];
                    f=0;
                }
            }
        }
        System.out.println(max[n-1]);
    }
}