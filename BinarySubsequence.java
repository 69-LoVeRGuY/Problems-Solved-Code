import java.io.*;
import java.util.*;
public class BinarySubsequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int min=Integer.MAX_VALUE,zero=0,one=0,f=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='0')
                    zero++;
                else
                    one++;
                if(i>0)
                {
                    if(s.charAt(i-1)>s.charAt(i))
                        f++;
                }
            }
            if(f==0)
            {
                System.out.println(0);
                continue;
            }
            min=Math.min(one,zero);
            char ch[]=s.toCharArray();
            int count=0;
            zero=0;
            one=0;
            for(int i=0;i<n;i++)
            {
                if(ch[i]=='1' && zero==0)
                {
                    count++;
                    ch[i]='0';
                    continue;
                }
                if(ch[i]=='0' && zero==0)
                {
                    zero++;
                    continue;
                }
                if(ch[i]=='0' && one>0)
                {
                    String r=s.substring(i,Math.min((i+one+1),s.length()));
                    if(r.length()>one && r.contains("1")==false)
                    {
                        count+=one;
                        one=0;
                        continue;
                    }
                    count++;
                    ch[i]='1';
                    continue;
                }
                if(ch[i]=='1' && i<=(n-2))
                {
                    if(ch[i-1]=='0' && ch[i+1]=='0')
                    {
                        count++;
                        ch[i]='0';
                        continue;
                    }
                    one++;
                    continue;
                }
                if(ch[i]=='0' && i<=(n-2))
                {
                    if(ch[i-1]=='1' && ch[i+1]=='1')
                    {
                        count++;
                        ch[i]='1';
                        one++;
                        continue;
                    }
                }
            }
            min=Math.min(count,min);
            System.out.println(min);
        }
    }
}