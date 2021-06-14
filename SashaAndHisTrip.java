import java.io.*;
import java.util.*;
public class SashaAndHisTrip
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        if(v>=(n-1))
            System.out.println(n-1);
        else
        {
            int total=v,sum=v,i=2;
            while(total!=(n-1))
            {
                if((n-1-total)>1)
                {
                    total++;
                    sum=sum+i;
                    i++;
                }
                else
                {
                    total++;
                    sum=sum+i;
                }
            }
            System.out.println(sum);
        }
    }
}   