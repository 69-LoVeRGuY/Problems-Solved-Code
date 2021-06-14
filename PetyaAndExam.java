import java.io.*;
import java.util.*;
public class PetyaAndExam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String good=sc.next();
        String s=sc.next();
        int t=sc.nextInt();
        while(t-->0)
        {
            String q=sc.next();
            int d=0,c=0;
            if(q.length()==s.length() && s.contains("*")==false)
            {
                for(int i=0;i<q.length();i++)
                {
                    if(s.charAt(i)!=q.charAt(i) && s.charAt(i)=='?')
                    {
                        String y=String.valueOf(q.charAt(i));
                        if(good.contains(y)==false)
                        {
                            c=-1;
                            break;
                        }
                    }
                    else if(s.charAt(i)!=q.charAt(i) && s.charAt(i)!='?')
                    {
                        c=-1;
                        break;
                    }
                }
                if(c==-1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else if(q.length()==s.length() && s.contains("*") && s.contains("?")==false)
            {
                for(int i=0;i<q.length();i++)
                {
                    if(s.charAt(i)!=q.charAt(i) && s.charAt(i)=='*')
                    {
                        String y=String.valueOf(q.charAt(i));
                        if(good.contains(y))
                        {
                            c=-1;
                            break;
                        }
                    }
                    else if(s.charAt(i)!=q.charAt(i) && s.charAt(i)!='*')
                    {
                        c=-1;
                        break;
                    }
                }
                if(c==-1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else if(q.length()!=s.length() && s.contains("*")==false)
                System.out.println("NO");
            else if(s.contains("?") && s.contains("*"))
            {
                if(q.length()<s.length() && s.indexOf('*')!=q.length())
                {
                    System.out.println("NO");
                    continue;
                }
                int a=Math.min(s.length(),q.length());
                for(int i=0;i<a;i++)
                {
                    if(s.charAt(i)!=q.charAt(i) && s.charAt(i)=='?')
                    {
                        String y=String.valueOf(q.charAt(i));
                        if(good.contains(y)==false)
                        {
                            c=-1;
                            break;
                        }
                    }
                    else if(s.charAt(i)!=q.charAt(i) && s.charAt(i)=='*')
                    {
                        String y="";
                        while(i<a)
                        {
                            if(s.charAt(i)!=q.charAt(i))
                                y=y+q.charAt(i);
                            else if(s.charAt(i)==q.charAt(i) || s.charAt(i)=='?')
                                break;
                            i++;
                        }
                        if(i<=q.length()-1 && s.charAt(i)!='?')
                            y=y+q.substring(i);
                        
                        for(int j=0;j<y.length();j++)
                        {
                            String z=String.valueOf(y.charAt(j));
                            if(good.contains(z))
                            {
                                c=-1;
                                break;
                            }
                        }
                    }
                    else if(s.charAt(i)!=q.charAt(i) && s.charAt(i)!='?' && s.charAt(i)!='*')
                    {
                        c=-1;
                        break;
                    }
                }
                if(c==-1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else if(s.length()!=q.length() && s.contains("*"))
            {
                if(q.length()<s.length() && s.indexOf('*')!=q.length())
                {
                    System.out.println("NO");
                    continue;
                }
                String y="";
                for(int i=0;i<s.length();i++)
                {
                    while(i<s.length())
                    {
                        if(s.charAt(i)!=q.charAt(i))
                             y=y+q.charAt(i);
                        else
                             break;
                        i++;
                    }
                    if(i<=q.length()-1)
                        y=y+q.substring(i);
                    for(int j=0;j<y.length();j++)
                    {
                        String z=String.valueOf(y.charAt(j));
                        if(good.contains(z))
                        {
                            c=-1;
                            break;
                        }
                    }
                }
            }
        }
    }
}