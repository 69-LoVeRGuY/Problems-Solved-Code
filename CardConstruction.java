import java.io.*;
import java.util.*;
public class CardConstruction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int count=0;
            while(n>=2)
            {
                int s=2,c=0;
                while(s<=n)
                {
                    if(s==n)
                        break;
                    s=s+5+(3*c);
                    c++;
                }
                if(s>n)
                    s=s-5-(3*(c-1));
                n=n-s;
                count++;
            }
            System.out.println(count);
        }
    }
}