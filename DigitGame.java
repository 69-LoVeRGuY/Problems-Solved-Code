import java.io.*;
import java.util.*;
public class DigitGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            char ch[]=s.toCharArray();
            List<Integer> r=new ArrayList();
            List<Integer> b=new ArrayList();
            for(int i=0;i<n;i++)
            {
                int a=(int)ch[i];
                if(i%2==0)
                    r.add(a);
                else
                    b.add(a);
            }
            if(r.size()>b.size())
            {
                int f=-1;
                for(int i=0;i<r.size();i++)
                {
                    if(r.get(i)%2!=0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==1)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            else if(r.size()<=b.size())
            {
                int f=-1;
                for(int i=0;i<b.size();i++)
                {
                    if(b.get(i)%2==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==1)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
        }
    }
}