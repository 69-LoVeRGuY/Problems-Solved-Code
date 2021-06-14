import java.io.*;
import java.util.*;
public class IQTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oddc=0,evenc=0,oddp=0,evenp=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                evenc++;
                evenp=i;
            }
            else
            {
                oddc++;
                oddp=i;
            }
        }
        if(evenc==1)
            System.out.println(evenp+1);
        else
            System.out.println(oddp+1);
    }
}