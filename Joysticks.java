import java.io.*;
import java.util.*;
public class Joysticks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int count=0;
        if(a1==1 && a2==1)
        {
            System.out.println(0);
            System.exit(0);
        }
        while(a1!=0 && a2!=0)
        {
            count++;
            if(a1>=a2)
            {
                a2+=1;
                a1-=2;
            }
            else
            {
                a2-=2;
                a1+=1;
            }
        }
        System.out.println(count);
    }
}