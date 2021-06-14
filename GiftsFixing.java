import java.io.*;
import java.util.*;
public class GiftsFixing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            Integer b[]=new Integer[n];
            int cmin=Integer.MAX_VALUE,omin=Integer.MAX_VALUE;
            long count=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]<cmin)
                    cmin=a[i];
            }
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
                if(b[i]<omin)
                    omin=b[i];
            }
            long ccarry=0,ocarry=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==cmin && b[i]==omin)
                    continue;
                else if(a[i]==cmin)
                {
                    ocarry=ocarry+(b[i]-omin);
                    continue;
                }
                else if(b[i]==omin)
                {
                    ccarry=ccarry+(a[i]-cmin);
                    continue;
                }
                else
                {
                    int diff1=a[i]-cmin;
                    int diff2=b[i]-omin;
                    int s=Math.min(diff1,diff2);
                    ccarry+=diff1-s;
                    ocarry+=diff2-s;
                    count+=s;
                }
            }
            count=count+ccarry+ocarry;
            System.out.println(count);
        }
    }
}