import java.io.*;
import java.util.*;
public class SumOfRoundNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            List<Integer> l=new ArrayList();
            String s=String.valueOf(n);
            for(int i=s.length()-1;i>=0;i--)
            {
                if(s.charAt(i)!='0')
                {
                    c++;
                    String h="";
                    h+=s.charAt(i);
                    int e=Integer.parseInt(h);
                    int f=e*(int)Math.pow(10,(s.length()-i-1));
                    l.add(f);
                }
            }
            System.out.println(l.size());
            for(int i=0;i<l.size();i++)
                System.out.print(l.get(i)+" ");
            System.out.println();
        }
    }
}