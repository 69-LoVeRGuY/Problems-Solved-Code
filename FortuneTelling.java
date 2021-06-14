import java.io.*;
import java.util.*;
public class FortuneTelling
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0,even=0,sum=0;
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
        if(even==n)
        {
            System.out.println(0);
            System.exit(0);
        }
        Arrays.sort(a);
        if(sum%2!=0)
            System.out.println(sum);
        else
        {
            for(int i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                {
                    sum=sum-a[i];
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}