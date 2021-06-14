import java.io.*;
import java.util.*;
public class CinemaLine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        long left=0;
        String result="YES";
        int b[]=new int[101];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(result.compareTo("YES")==0)
            {
                 int c=a[i]-25;
                 if(c==25)
                 {
                     if(b[25]>=1)
                     {
                         b[25]-=1;
                         b[50]++;
                     }
                     else
                        result="NO";
                 }
                 else if(c==75)
                 {
                     if(b[25]>=1 && b[50]>=1)
                     {
                         b[25]-=1;
                         b[50]-=1;
                         b[100]++;
                     }
                     else if(b[25]>=3)
                     {
                         b[25]-=3;
                         b[100]++;
                     }
                     else 
                        result="NO";
                 }
                 else
                    b[25]++;
            }
        }
        System.out.println(result);
    }
}