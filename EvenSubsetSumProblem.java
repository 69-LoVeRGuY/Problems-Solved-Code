import java.io.*;
import java.util.*;
public class EvenSubsetSumProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int evenp=-1,odd=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                    evenp=i;
                else
                    odd++;
            }
            if(evenp!=-1)
            {
                System.out.println(1);
                System.out.println(evenp+1);
            }
            else if(odd==n && n==1)
                System.out.println(-1);
            else if(odd>=2)
            {
                int f=0;
                System.out.println(2);
                for(int i=0;i<n;i++)
                {
                    if(a[i]%2!=0)
                    {
                        System.out.print(i+1+" ");
                        f++;
                    }
                    if(f==2)
                        break;
                }
                System.out.println();
            }
            else
                System.out.println(-1);
        }
    }
}