import java.io.*;
import java.util.*;
public class FairDivision
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a=0,one=0;
            for(int i=0;i<n;i++)
            {
                int s=sc.nextInt();
                if(s==1)
                {
                    a+=1;
                    one++;
                }
                else
                    a+=2;
            }
            if((a%2==0 && n%2==0) || (a%2==0 && n%2!=0 && one%2==0 && one!=0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}