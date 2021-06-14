import java.io.*;
import java.util.*;
public class UniqueQuery
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int s=sc.nextInt();
        int a[]=new int[100001];
        for(int i=1;i<=n;i++)
            a[i]=sc.nextInt();
        if(n<=1000)
        {
            int ans[][]=new int[n+1][n+1];
            for(int i=1;i<=n;i++)
                ans[i][i]=1;
            for(int i=1;i<=n-1;i++)
	    {
		int m = a[i];
		for(int j=i+1;j<=n;j++)
		{
		    if(m>=a[j])
		        ans[i][j] = ans[i][j-1];
		    else
		    {
			ans[i][j] = ans[i][j-1] + 1;
			m = a[j];
		    }
		}
	    }
	    int prev = 0;
	    while(q-->0)
	    {
		int l=sc.nextInt();
		int r=sc.nextInt();
		l = (l + s*(prev) -1)%n + 1;
		r = (r + s*(prev) -1)%n + 1;
		if(l>r)
		{
		    int temp=l;
		    l=r;
		    r=temp;
		}
		int c = 1;
		for(int i=l;i<=r;i++)
		     c = Math.max(c,ans[i][r]);
		System.out.println(c);
		prev=c;
	    }
	}
    }
}	