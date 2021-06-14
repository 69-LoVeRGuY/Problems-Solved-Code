import java.io.*;
import java.util.*;
public class Acode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String s=sc.next();
            if(s.compareTo("0")==0)
                System.exit(0);
            int a[]=new int[s.length()+1];
            a[0]=1;
            a[1]=1;
            for(int i=2;i<=s.length();i++)
            {
                if(Integer.parseInt(s.substring(i-1,i))>0)
                    a[i]+=a[i-1];
                int twodigit=Integer.parseInt(s.substring(i-2,i));
                if(twodigit>=10 && twodigit<=26)
                    a[i]+=a[i-2];
            }
            System.out.println(a[s.length()]);
        }
    }
}