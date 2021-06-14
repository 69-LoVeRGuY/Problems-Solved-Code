import java.io.*;
import java.util.*;
public class AcaciousAndString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<=s.length()-7;i++)
            {
                String r=s.substring(i,i+7);
                int q=0;
                if(r.equals("abacaba"))
                    count++;
                else if(r.contains("?"))
                {
                    for(int j=0;j<7;j++)
                    {
                        if(r.charAt(j)=='?' && j==0)
                        {
                            if(count==0)
                                r="a"+r.substring(1);
                            else
                                r="z"+r.substring(1);
                        }
                        else if(r.charAt(j)=='?' && r.charAt(j-1)=='a' && (q==0 || q==2))
                        {
                            if(count==0)
                            {
                                r=r.substring(0,j)+"b"+r.substring(j+1);
                                q++;
                            }
                            else
                                r=r.substring(0,j)+"z"+r.substring(j+1);
                        }
                        else if(r.charAt(j)=='?' && r.charAt(j-1)=='a' && q==1)
                        {
                            if(count==0)
                            {
                                r=r.substring(0,j)+"c"+r.substring(j+1);
                                q++;
                            }
                            else
                                r=r.substring(0,j)+"z"+r.substring(j+1);
                        }
                        else if(r.charAt(j)=='?' && (r.charAt(j-1)=='b' || r.charAt(j-1)=='c'))
                        {
                            if(count==0)
                                r=r.substring(0,j)+"a"+r.substring(j+1);
                            else
                                r=r.substring(0,j)+"z"+r.substring(j+1);
                        }
                        else if(r.charAt(j)=='b' || r.charAt(j)=='c')
                            q++;
                        else if(r.charAt(j)=='?')
                            r=r.substring(0,j)+"z"+r.substring(j+1);
                    }
                    if(r.equals("abacaba"))
                        count++;
                    s=s.substring(0,i)+r+s.substring(i+7);
                }
            }
            if(count==1)
            {
                System.out.println("YES");
                System.out.println(s);
            }
            else
                System.out.println("NO");
        }
    }
}