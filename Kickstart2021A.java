import java.io.*;
import java.util.*;
public class Kickstart2021A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int count=0;
            for(int i=0;i<s.length()/2;i++)
            {
                if(s.charAt(i)!=s.charAt(n-1-i))
                    count++;
            }
            if(count>=k)
                System.out.println("Case #"+j+":"+" "+0);
            else
                System.out.println("Case #"+j+":"+" "+(k-count));
        }
    }
}