import java.io.*;
import java.util.*;
public class DivisorAndTwoIntegers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max1=0,max2=0;
        List<Integer> l=new ArrayList();
        List<Integer> r=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            l.add(a);
            if(a>max1)
                max1=a;
        }
        int i=0;
        while(i<l.size())
        {
            if(max1%(l.get(i))==0)
            {
                if(r.contains(l.get(i))==false)
                {
                    r.add(l.get(i));
                    l.remove(i);
                }
                else
                    i++;
            }
            else
                i++;
        }
        for(int j=0;j<l.size();j++)
        {
            if(l.get(j)>max2)
                max2=l.get(j);
        }
        if(max2!=0)
            System.out.println(max1+" "+max2);
        else
            System.out.println(max1+" "+max1);
    }
}