import java.io.*;
import java.util.*;
public class PoloAndMatrix
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int d=sc.nextInt();
       int a[]=new int[n*m];
       int c=0;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               a[c]=sc.nextInt();
               c++;
           }
       }
       Arrays.sort(a);
       int f=0,b=0,count=0;
       if((n*m)%2==0)
            b=((n*m)/2)-1;
       else
            b=(n*m)/2;
       for(int i=0;i<(n*m);i++)
       {
           if(i==b)
                continue;
           else if((Math.abs(a[i]-a[b]))%d==0)
           {
               int x=(Math.abs(a[i]-a[b]))/d;
               count+=x;
           }
           else 
           {
               f=1;
               break;
           }
       }
       if(f==1)
            System.out.println(-1);
       else
            System.out.println(count);
   }
}