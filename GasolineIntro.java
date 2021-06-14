import java.io.*;
import java.util.*;
public class GasolineIntro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int f[]=new int[n];
            for(int i=0;i<n;i++)
                f[i]=sc.nextInt();
            int sum=0,curr=f[0],c=1;
            while(curr>0 && c<n)
            {
                sum++;
                curr=curr-1+f[c];
                c++;
            }
            if(curr>0)
                sum=sum+curr;
            System.out.println(sum);
        }
    }
}