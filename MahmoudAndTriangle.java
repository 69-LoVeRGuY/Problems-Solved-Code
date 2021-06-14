import java.io.*;
import java.util.*;
public class MahmoudAndTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int f=-1;
        for(int i=n-1;i>=2;i--)
        {
            if(((a[i]+a[i-1])>a[i-2]) && ((a[i]+a[i-2])>a[i-1]) && ((a[i-2]+a[i-1])>a[i]))
            {
                f++;
                break;
            }
        }
        if(f!=-1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}