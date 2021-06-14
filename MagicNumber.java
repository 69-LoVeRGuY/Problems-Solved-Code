import java.io.*;
import java.util.*;
public class MagicNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int c=s.length()-1,f=0;
        if(s.contains("2") || s.contains("3") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9") || s.contains("0"))
        {
            System.out.println("NO");
            System.exit(0);
        }
        if(s.length()==1 && s.charAt(0)!='1')
        {
            System.out.println("NO");
            System.exit(0);
        }
        else if(s.length()==1)
        {
            System.out.println("YES");
            System.exit(0);
        }
        if(s.length()==2 && (s.compareTo("11")==0 || s.compareTo("14")==0))
        {
            System.out.println("YES");
            System.exit(0);
        }
        else if(s.length()==2)
        {
            System.out.println("NO");
            System.exit(0);
        }
        while(c>=0)
        {
            if(s.charAt(c)=='1')
                c--;
            else if(c-1>=0)
            {
                if(s.charAt(c)=='4'&& s.charAt(c-1)=='1')
                    c-=2;
                else if(c-2>=0)
                {
                    if(s.charAt(c)=='4' && s.charAt(c-1)=='4' && s.charAt(c-2)=='1')
                        c-=3;
                    else 
                    {
                        f=-1;
                        break;
                    }
                }
                else
                {
                    f=-1;
                    break;
                }
            }
            else
            {
                 f=-1;
                 break;
            }
        }
        if(f==-1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}