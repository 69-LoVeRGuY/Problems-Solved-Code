import java.io.*;
import java.util.*;
public class Cutting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int count=0,sum=0,odd=0,even=0;
        List<Integer> al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
                odd++;
            else
                even++;
            if(i!=n-1)
            {
                if(odd==even)
                    al.add(Math.abs(a[i+1]-a[i]));
            }
        }
        Collections.sort(al);
        Integer c[]=new Integer[al.size()];
        c=al.toArray(c);
        for(int i=0;i<al.size();i++)
        {
            sum+=c[i];
            if(sum<=b)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}