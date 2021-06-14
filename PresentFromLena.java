import java.io.*;
import java.util.*;
public class PresentFromLena
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n,max=0;
        for(int i=1;i<=n+1;i++)
        {
            for(int j=1;j<=space*2;j++)
                System.out.print(" ");
            for(int j=0;j<=max;j++)
            {
                if(max==0)
                    System.out.print(j);
                else
                    System.out.print(j+" ");
            }
            int r=max-1;
            max++;
            space--;
            for(int j=r;j>=0;j--)
            {
                if(j==0)
                    System.out.print(j);
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
        int space2=1,max2=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space2*2;j++)
                System.out.print(" ");
            for(int j=0;j<=max2;j++)
            {
                if(max2==0)
                    System.out.print(j);
                else
                    System.out.print(j+" ");
            }
            int r=max2-1;
            max2--;
            space2++;
            for(int j=r;j>=0;j--)
            {
                if(j==0)
                    System.out.print(j);
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
   