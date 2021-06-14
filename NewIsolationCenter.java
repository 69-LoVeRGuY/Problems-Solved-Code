import java.io.*;
import java.util.*;
public class NewIsolationCenter
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        int t=Integer.parseInt(in.readLine());
        for(int i=0;i<t;i++)
        {
            String x[]=in.readLine().split(" ");
            int n=Integer.parseInt(x[0]);
            int q=Integer.parseInt(x[1]);
            String s=in.readLine();
            int c[]=new int[q];
            for(int j=0;j<q;j++)
            {
                c[j]=Integer.parseInt(in.readLine());
            }
            for(int j=0;j<q;j++)
            {
                List<Character> ch=new ArrayList<Character>();
                for(int k=0;k<s.length();k++)
                {
                    ch.add(s.charAt(k));
                }
                int left=n;
                List<Character> p=new ArrayList<Character>();
                for(int z=0;z<c[j];z++)
                {
                    int u=0;
                    while(u<ch.size())
                    {
                        if(p.contains(ch.get(u))==false)
                        {
                            p.add(ch.get(u));
                            ch.remove(ch.get(u));
                        }
                        else
                            u++;
                    }
                    left=left-p.size();
                }
                if(left<0)
                    System.out.println(0);
                else
                    System.out.println(left);
            }
        }
    }
}