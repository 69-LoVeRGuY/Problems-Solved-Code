import java.io.*;
import java.util.*;
public class PalindromeDance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int p1=0,p2=n-1,cost=0;
        while(p1<=p2)
        {
            if(p1==p2)
            {
                if(arr[p1]==2)
                {
                    cost+=Math.min(a,b);
                    p1++;
                }
                else
                    p1++;
            }
            else
            {
                if(arr[p1]==arr[p2] && (arr[p1]!=2 && arr[p2]!=2))
                {
                    p1++;
                    p2--;
                }
                else if(arr[p1]==arr[p2] && (arr[p1]==2 && arr[p2]==2))
                {
                    cost+=2*Math.min(a,b);
                    p1++;
                    p2--;
                }
                else if((arr[p1]==2 && arr[p2]!=2))
                {
                    if(arr[p2]==1)
                        cost+=b;
                    else
                        cost+=a;
                    p1++;
                    p2--;
                }
                else if((arr[p1]!=2 && arr[p2]==2))
                {
                    if(arr[p1]==1)
                        cost+=b;
                    else
                        cost+=a;
                    p1++;
                    p2--;
                }
                else
                {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(cost);
    }
}
 