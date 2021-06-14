import java.io.*;
import java.util.*;
public class BuyTheString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int cz=sc.nextInt();
            int co=sc.nextInt();
            int h=sc.nextInt();
            String s=sc.next();
            int one=0,zero=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                    zero++;
                else
                    one++;
            }
            int min=(zero*cz)+(one*co);
            if(((zero*h)+(zero*co))<(zero*cz))
                min=(one*co)+(zero*h)+(zero*co);
            else if(((one*h)+(one*cz))<(one*co))
                min=(zero*cz)+(one*h)+(one*cz);
            System.out.println(min);
        }
    }
}