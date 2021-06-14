import java.io.*;
import java.util.*;
public class FloorNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n==1 || n==2)
            {
                System.out.println(1);
                continue;
            }
            int ans=0,c=1,start=2,end=x+2;
            while(true)
            {
                if(n>=start && n<=end)
                {
                    ans=c+1;
                    break;
                }
                else
                {
                    start=end+1;
                    end=end+x;
                    c++;
                }
            }
            System.out.println(ans);
        }
    }
}