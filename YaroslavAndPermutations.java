import java.io.*;
import java.util.*;
public class YaroslavAndPermutations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[1001];
        Arrays.fill(a,0);
        double r=Math.ceil(n/(double)2);
        int f=0;
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a[s]++;
            if(a[s]>(int)r)
                f++;
        }
        if(f==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}