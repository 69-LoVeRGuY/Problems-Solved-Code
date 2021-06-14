import java.io.*;
import java.util.*;
public class CommonPrefixes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=-1;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>max)
                    max=a[i];
            }
            String s="";
            for(int i=0;i<max;i++)
                s=s+"a";
            if(s.length()==0)
            {
                s="a";
                max=1;
            }
            System.out.println(s);
            for(int i=0;i<n;i++)
            {
                String r=s.substring(0,a[i]);
                for(int j=a[i];j<max;j++)
                {
                    if(s.charAt(j)+1=='z')
                        r=r+"a";
                    else
                        r=r+String.valueOf((char)(s.charAt(j)+1));
                }
                System.out.println(r);
                s=r;
            }
        }
    }
}
                    
                        