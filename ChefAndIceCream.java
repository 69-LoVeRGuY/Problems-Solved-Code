import java.io.*;
import java.util.*;
public class ChefAndIceCream
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
            int n=sc.nextInt();
            int a[]=new int[n];
            String result="YES";
            int b[]=new int[16];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(result.compareTo("YES")==0)
                {
                     int c=a[i]-5;
                     if(c==5)
                     {
                         if(b[5]>=1)
                         {
                             b[5]-=1;
                             b[10]++;
                         }
                         else
                            result="NO";
                     }
                     else if(c==10)
                     {
                         if(b[10]>=1)
                         {
                             b[10]-=1;
                             b[15]++;
                         }
                         else if(b[5]>=2)
                         {
                             b[5]-=2;
                             b[15]++;
                         }
                         else 
                            result="NO";
                     }
                     else
                        b[5]++;
                }
            }
            System.out.println(result);
        }
    }
} 
 