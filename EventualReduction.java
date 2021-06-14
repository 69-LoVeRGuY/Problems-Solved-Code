import java.io.*;
import java.util.*;
public class EventualReduction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next().toLowerCase();
            if(n%2!=0)
                System.out.println("NO");
            else
            {
                int c[]=new int[123];
                int f=-1;
                for(int i=0;i<n;i++)
                {
                    char ch=s.charAt(i);
                    c[ch]++;
                }
                for(int i=97;i<123;i++)
                {
                    if(c[i]%2!=0)
                    {
                        f=0;
                        break;
                    }
                }
                if(f==0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}