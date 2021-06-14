import java.io.*;
import java.util.*;
public class StringTransformation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int ans=0,left=n,f=0;
            if(a.compareTo(b)==0)
            {
                System.out.println(0);
                continue;
            }
            for(int i=0;i<n;i++)
            {
                if(a.charAt(i)>b.charAt(i))
                {
                    f=-1;
                    break;
                }
                if(i>0)
                {
                    int count=1,j=i;
                    while(b.charAt(j)==b.charAt(j-1))
                    {
                        count++;
                        j++;
                        if(j==n)
                            break;
                    }
                    if(count>1)
                    {
                        ans++;
                        left-=count;
                    }
                }
            }
            if(f==-1)
                System.out.println(-1);
            else
                System.out.println(ans+left);
        }
    }
}