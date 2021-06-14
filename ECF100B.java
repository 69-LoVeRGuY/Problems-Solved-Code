import java.io.*;
import java.util.*;
public class ECF100B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==1)
                    b[i]=1;
                else
                {
                    int half=a[i]/2;
                    if(half%2!=0)
                        half=half+1;
                    if(i>0)
                    {
                        if(b[i-1]%half==0 || half%b[i-1]==0)
                            b[i]=half;
                        else
                            b[i]=2*(b[i-1]);
                    }
                    else
                        b[i]=half;
                }
            }
            for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}