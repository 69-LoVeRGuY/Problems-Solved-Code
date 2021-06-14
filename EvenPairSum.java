import java.io.*;
import java.util.*;
public class EvenPairSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int odd1=0,odd2=0,even1=0,even2=0;
            if(a%2==0)
                odd1=a/2;
            else
                odd1=(a/2)+1;
            even1=a/2;
            if(b%2==0)
                odd2=b/2;
            else
                odd2=(b/2)+1;
            even2=b/2;
            long ans=(long)(odd1*odd2)+(long)(even1*even2);
            System.out.println(ans);
        }
    }
}