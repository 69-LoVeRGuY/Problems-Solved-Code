import java.io.*;
import java.util.*;
public class AvoidTrygub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int ct=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='t')
                    ct++;
            }
            s=s.replaceAll("t","");
            for(int i=0;i<ct;i++)
                s=s+"t";
            System.out.println(s);
        }
    }
}