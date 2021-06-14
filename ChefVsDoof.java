import java.io.*;
import java.util.*;
public class ChefVsDoof
{
           
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int ans=0;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a%2==0)
                    ans++;
            }
            if(ans>0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}