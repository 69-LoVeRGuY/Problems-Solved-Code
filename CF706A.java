import java.io.*;
import java.util.*;
public class CF706A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if(k==0)
            {
                System.out.println("YES");
                continue;
            }
            boolean pal=true;
            int start=0,end=n-1;
            while(start<end)
            {
                if(s.charAt(start)!=s.charAt(end))
                {
                    pal=false;
                    break;
                }
                start++;
                end--;
            }
            if(pal==true && ((n%2==1) || (n%2==0 && k<(n/2))))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
 