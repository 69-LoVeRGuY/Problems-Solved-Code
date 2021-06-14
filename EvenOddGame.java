import java.io.*;
import java.util.*;
public class EvenOddGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            long alice=0,bob=0;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int c=0;
            for(int i=n-1;i>=0;i--)
            {
                if(c%2==0)
                {
                    if(a[i]%2==0)
                        alice+=a[i];
                }
                else
                {
                    if(a[i]%2==1)
                        bob+=a[i];
                }
                c++;
            }
            if(alice>bob)
                System.out.println("Alice");
            else if(bob>alice)
                System.out.println("Bob");
            else
                System.out.println("Tie");
        }
    }
}