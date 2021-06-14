import java.io.*;
import java.util.*;
public class Program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            int a[]=new int[n];
            int dis[]=new int[n];
            HashSet<Integer> set=new HashSet();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='-')
                {
                    if(i==0)
                        a[i]=-1;
                    else
                        a[i]=a[i-1]-1;
                    int prev=set.size();
                    set.add(a[i]);
                    if(set.size()>prev)
                    {
                        if(i==0)
                            dis[i]=1;
                        else
                            dis[i]=dis[i-1]+1;
                    }
                    else
                    {
                        if(i>0)
                            dis[i]=dis[i-1];
                    }
                }
                else
                {
                    if(i==0)
                        a[i]=1;
                    else
                        a[i]=a[i-1]+1;
                    int prev=set.size();
                    set.add(a[i]);
                    if(set.size()>prev)
                    {
                        if(i==0)
                            dis[i]=1;
                        else
                            dis[i]=dis[i-1]+1;
                    }
                    else
                    {
                        if(i>0)
                            dis[i]=dis[i-1];
                    }
                }
            }
            for(int i=0;i<m;i++)
            {
                int l=sc.nextInt()-1;
                int r=sc.nextInt()-1;
                int diff=a[r]-a[l];
                int ans=a[n-1];
                if(diff<0)
                    ans+=diff;
                else
                    ans-=diff;
                System.out.println(ans);
            }
        }
    }
}