import java.io.*;
import java.util.*;
public class LOneQOne
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter number to be searched");
        int x=sc.nextInt();
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                ans=i+1;
                break;
            }
        }
        System.out.println("Item is present at array index: "+ans);
    }
}