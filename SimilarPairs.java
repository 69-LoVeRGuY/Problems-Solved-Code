import java.io.*;
import java.util.*;
public class SimilarPairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int odd=0,even=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                    even++;
                else
                    odd++;
            }
            if(odd%2==0 && even%2==0)
            {
                System.out.println("YES");
                continue;
            }
            int f=0;
            Arrays.sort(a);
            for(int i=0;i<n-1;i++)
            {
                if(a[i+1]-a[i]==1)
                    f=1;
            }
            if(f==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}