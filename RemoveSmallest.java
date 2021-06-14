import java.io.*;
import java.util.*;
public class RemoveSmallest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            if(n==1)
            {
                System.out.println("YES");
                continue;
            }
            Arrays.sort(a);
            int f=1;
            for(int i=1;i<n;i++)
            {
                if(a[i]-a[i-1]>1)
                {
                    f=-1;
                    break;
                }
            }
            if(f==-1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}