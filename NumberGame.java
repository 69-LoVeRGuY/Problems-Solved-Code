import java.util.*;
public class NumberGame
{
    public static boolean prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=sc.nextInt();
            int p=0;
            if(n==1)
                System.out.println("FastestFinger");
            else if(n%2!=0 || n==2)
                System.out.println("Ashishgup");
            else
            {
                while(n%2==0)
                {
                    n=n/2;
                    p++;
                }
                if(n==1||(p==1 && prime(n)))
                    System.out.println("FastestFinger");
                else
                    System.out.println("Ashishgup");
            }
        }
        sc.close();
    }   
}