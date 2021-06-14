import java.io.*;
import java.util.*;
public class CovidRun
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x==y)
            {
                System.out.println("YES");
                continue;
            }
            if(k==0 || k==n || k%n==0)
            {
                System.out.println("NO");
                continue;
            }
            HashSet<Integer> set=new HashSet();
            set.add(x);
            int f=0;
            while(f==0)
            {
                x=x+k;
                if(x<n && x==y)
                {
                    f=1;
                    break;
                }
                if(x>n-1)
                {
                    int r=x-(n-1);
                    if(set.contains(r-1))
                    {
                        f=-1;
                    }
                    else
                    {
                        set.add(r-1);
                        x=r-1;
                    }
                }
                else
                {
                    if(set.contains(x))
                    {
                        f=-1;
                    }
                    else
                        set.add(x);
                }
                if(x==y)
                    f=1;
            }
            if(f==-1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}