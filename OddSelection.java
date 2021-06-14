import java.io.*;
import java.util.*;
public class OddSelection
{
    public static void main(String arrgs[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int odd=0,even=0;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a%2!=0)
                    odd++;
                else
                    even++;
            }
            if(x%2==0)
            {
                if(even<x)
                {
                    if(even%2!=0 && odd>=(x-even))
                        System.out.println("Yes");
                    else if(even%2==0 && odd>=(x-(even-1)) && even!=0)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
                else
                {
                    if(odd>0)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
            else
            {
                if(odd<x)
                {
                    if(odd%2!=0 && even>=(x-odd))
                        System.out.println("Yes");
                    else if(odd%2==0 && even>=(x-(odd-1)) && odd!=0)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
                else
                {
                    System.out.println("Yes");
                }
            }
        }
    }
}