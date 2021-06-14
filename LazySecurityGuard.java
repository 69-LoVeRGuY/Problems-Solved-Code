import java.io.*;
import java.util.*;
public class LazySecurityGuard
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sr=(int)(Math.sqrt(n));
        int left=n-(sr*sr);
        int count=0,result=0;
        while(left>=sr)
        {
            left=left-sr;
            count++;
        }
        result=result+sr+((sr+count)*2)+(sr-left);
        if(left==1)
            result=result+3;
        else if(left>1)
            result=result+(left-2)+(2*2);
        System.out.println(result);
    }
}