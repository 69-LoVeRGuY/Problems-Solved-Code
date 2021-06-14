import java.io.*;
import java.util.*;
public class BalancedBitstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            String sub="";
            int oc=0,zc=0,qc=0,f=0;
            for(int i=0;i<k;i++)
            {
                if(s.charAt(i)=='1')
                    oc++;
                else if(s.charAt(i)=='0')
                    zc++;
                else
                    qc++;
            }
            if(oc==zc && qc==0)
                qc=0;
            else if(oc==zc && qc%2==0)
                qc=0