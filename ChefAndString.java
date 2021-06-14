import java.io.*;
import java.util.*;
public class ChefAndString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int pairs=0,i=0,f=0;
            if(s.length()==1)
            {
                System.out.println(0);
                continue;
            }
            while(i<s.length()-1)
            {
                if(i==s.length()-2)
                    f++;
                if(s.charAt(i)=='x' && s.charAt(i+1)=='y')
                {
                    pairs++;
                    i=i+2;
                }
                else if(s.charAt(i)=='y' && s.charAt(i+1)=='x')
                {
                    pairs++;
                    i=i+2;
                }
                else
                    i++;
            }
            System.out.println(pairs);
        }
    }
}