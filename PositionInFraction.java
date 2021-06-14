import java.io.*;
import java.util.*;
import java.math.*;
public class PositionInFraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        BigDecimal x=BigDecimal.valueOf(a);
        BigDecimal y=BigDecimal.valueOf(b);
        String s=String.valueOf(x.divide(y,1000,RoundingMode.CEILING));
        int ans=-1,pos=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                pos=i;
                break;
            }
        }
        String e=s.substring(pos+1,s.length()-1);
        if(e.contains(String.valueOf(c)))
        {
            for(int i=0;i<e.length();i++)
            {
                if(e.charAt(i)==c)
                {
                    ans=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
        else    
            System.out.println(-1);
    }
}