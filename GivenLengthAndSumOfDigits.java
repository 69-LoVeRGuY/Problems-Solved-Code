import java.io.*;
import java.util.*;
public class GivenLengthAndSumOfDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int s=sc.nextInt();
        if((s==0 && m!=1) || (s>(m*9)))
        {
            System.out.println(-1+" "+-1);
            System.exit(0);
        }
        String max="",min="";
        String result[]=new String[2];
        if(s<=9)
        {
            max=max+String.valueOf(s);
            for(int i=1;i<=m-1;i++)
                max=max+"0";
            result[1]=max;
            if(m!=1)
            {
                min=min+"1";
                for(int i=1;i<=m-2;i++)
                    min=min+"0";
                min=min+String.valueOf(s-1);
            }
            else
                min=max;
            result[0]=min;
        }
        else
        {
            int f=0,c=0,r=s;
            while(r>9)
            {
                max=max+"9";
                r-=9;
                f++;
            }
            max=max+String.valueOf(r);
            String h=max;
            for(int i=1;i<=(m-f-1);i++)
            {
                max=max+"0";
                c++;
            }
            result[1]=max;
            if(c==0)
            {
                for(int i=max.length()-1;i>=0;i--)
                     min=min+max.charAt(i);
                result[0]=min;
            }
            else
            {
                min=min+"1";
                int x=Integer.parseInt(h.substring(h.length()-1));
                x--;
                for(int i=1;i<=(m-h.length()-1);i++)
                    min=min+"0";
                min=min+String.valueOf(x);
                for(int i=h.length()-2;i>=0;i--)
                     min=min+h.charAt(i);
                result[0]=min;
            }
        }
        System.out.println(result[0]+" "+result[1]);
    }
}