import java.io.*;
import java.util.*;
public class LOneQThree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            a[i]=sc.next();
        System.out.println("Enter Licence Number to be searched");
        String x=sc.next();
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i].equals(x))
            {
                ans=i+1;
                break;
            }
        }
        System.out.println("Licence number found at: "+ans);
    }
}