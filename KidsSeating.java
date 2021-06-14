import java.io.*;
import java.util.*;
public class KidsSeating
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            for(int i=4*n;i>=2;i-=2)
            {
                c++;
                System.out.print(i+" ");
                if(c==n)
                    break;
            }
            System.out.println();
        }
    }
}