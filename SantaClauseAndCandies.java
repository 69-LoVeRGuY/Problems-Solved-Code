import java.io.*;
import java.util.*;
public class SantaClauseAndCandies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2)
        {
            System.out.println(1);
            System.out.println(n);
            System.exit(0);
        }
        int count=0,save=0,sum=0;
        for(int i=1;;i++)
        {
            count=(i*(i+1))/2;
            save=i;
            if(count<=n && (n-count)<=i)
                break;
            if(count>n)
                break;
        }
        System.out.println(save);
        for(int i=1;i<=save-1;i++)
        {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println(n-(sum));
    }
}