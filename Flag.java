import java.io.*;
import java.util.*;
public class Flag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int f=0;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            HashSet<Integer> set=new HashSet();
            for(int j=0;j<m;j++)
            {
                a[i][j]=(int)s.charAt(j);
                set.add(a[i][j]);
            }
            if(set.size()>1)
                f=-1;
        }
        if(f==-1)
        {
            System.out.println("NO");
            System.exit(0);
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i][0]==a[i+1][0])
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