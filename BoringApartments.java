import java.io.*;
import java.util.*;
public class BoringApartments
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String x=sc.next();
            String s[]={"1","11","111","1111","2","22","222","2222","3","33","333","3333","4","44","444","4444","5","55","555","5555","6","66","666","6666","7","77","777","7777","8","88","888","8888","9","99","999","9999"};
            int sum=0;
            for(int i=0;i<36;i++)
            {
                if(s[i].compareTo(x)==0)
                {
                    sum=sum+s[i].length();
                    break;
                }
                else
                    sum=sum+s[i].length();
            }
            System.out.println(sum);
        }
    }
}