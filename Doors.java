import java.io.*;
import java.util.*;
public class Doors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=-1,c=-1;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a==0)
                b=i;
            if(a==1)
                c=i;
        }
        if(b==-1 || c==-1)
            System.out.println(n);
        else
        {
            if(b<c)
                System.out.println(b+1);
            else
                System.out.println(c+1);
        }
    }
}
