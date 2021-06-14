import java.io.*;
import java.util.*;
public class ChefAndSteps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s="";
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a%k==0)
                    s=s+"1";
                else
                    s=s+"0";
            }
            System.out.println(s);
        }
    }
}