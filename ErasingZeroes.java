import java.io.*;
import java.util.*;
public class ErasingZeroes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int prev=-1,sum=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                {
                    if(prev==-1)
                        prev=i;
                    else
                    {
                        sum=sum+(i-prev-1);
                        prev=i;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}