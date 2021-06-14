import java.io.*;
import java.util.*;
public class CF723A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[2*n];
            for(int i=0;i<2*n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int ans[]=new int[2*n];
            int start=0,end=2*n-1;
            for(int i=0;i<2*n;i++)
            {
                if(i%2==0)
                {
                    ans[i]=a[end];
                    end--;
                }
                else
                {
                    ans[i]=a[start];
                    start++;
                }
            }
            for(int i=0;i<2*n;i++)
                System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
}