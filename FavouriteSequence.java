import java.io.*;
import java.util.*;
public class FavouriteSequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int ans[]=new int[n];
            int start=0,end=n-1,c=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            while(start<=end)
            {
                if(start==end)
                {
                    ans[c]=a[start];
                    start++;
                    break;
                }
                ans[c]=a[start];
                c++;
                if(c>(n-1))
                    break;
                ans[c]=a[end];
                c++;
                start++;
                end--;
            }
            for(int i=0;i<n;i++)
                System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
}