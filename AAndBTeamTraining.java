import java.io.*;
import java.util.*;
public class AAndBTeamTraining
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        while((n+m)>=3 && n>0 && m>0)
        {
            if(n>=m)
            {
                n-=2;
                m-=1;
                count++;
            }
            else
            {
                m-=2;
                n-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}