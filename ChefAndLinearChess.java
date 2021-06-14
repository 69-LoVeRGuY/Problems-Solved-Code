import java.io.*;
import java.util.*;
public class ChefAndLinearChess
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int min=Integer.MAX_VALUE,ans=-1;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(k%a==0 && (k/a)<min)
                {
                    min=k/a;
                    ans=a;
                }
            }
            System.out.println(ans);
        }
    }
}