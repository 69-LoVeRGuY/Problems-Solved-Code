import java.io.*;
import java.util.*;
public class PrefixSumPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int one=0,two=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==1)
                one++;
            else
                two++;
        }
        for(int i=0;i<n;i++)
        {
                if(i==1 && one>0)
                {
                    System.out.print(1+" ");
                    one--;
                }
                else if(two>0)
                {
                    System.out.print(2+" ");
                    two--;
                }
                else
                {
                    System.out.print(1+" ");
                    one--;
                }
        }
        System.out.println();
    }
}