import java.io.*;
import java.util.*;
public class Urbanization
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
        {
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int c1=0,c2=0;
        double m1=0,m2=0;
        for(int i=n-1;i>=0;i--)
        {
            if(c1<n1)
            {
                c1++;
                m1+=a[i];
            }
            else
            {
                c2++;
                m2+=a[i];
            }
            if(c1==n1 && c2==n2)
                break;
        }
        double ans=(m1/n1)+(m2/n2);
        System.out.println(ans);
    }
}