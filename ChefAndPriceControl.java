import java.io.*;
import java.util.*;
public class ChefAndPriceControl
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long loss=0;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a>k)
                    loss=loss+((long)(a-k));
            }
            System.out.println(loss);
        }
    }
}