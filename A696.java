import java.io.*;
import java.util.*;
public class A696
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String prev="";
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    ans=ans.append("1");
                    if(s.charAt(i)=='1')
                        prev="2";
                    else
                        prev="1";
                    continue;
                }
                if(prev.equals("2"))
                {
                    if(s.charAt(i)=='1')
                    {
                        ans=ans.append("0");
                        prev="1";
                    }
                    else
                    {
                        ans=ans.append("1");
                        prev="1";
                    }
                }
                else if(prev.equals("1"))
                {
                    if(s.charAt(i)=='1')
                    {
                        ans=ans.append("1");
                        prev="2";
                    }
                    else
                    {
                        ans=ans.append("0");
                        prev="0";
                    }
                }
                else
                {
                    if(s.charAt(i)=='1')
                    {
                        ans=ans.append("1");
                        prev="2";
                    }
                    else
                    {
                        ans=ans.append("1");
                        prev="1";
                    }
                }
            }
            System.out.println(ans);
        }
    }
}