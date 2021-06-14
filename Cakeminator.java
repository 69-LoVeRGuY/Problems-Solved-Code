import java.io.*;
import java.util.*;
public class Cakeminator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String a[]=new String[r];
        HashSet<Integer> row=new HashSet();
        HashSet<Integer> col=new HashSet();
        for(int i=0;i<r;i++)
        {
            a[i]=sc.next();
            for(int j=0;j<c;j++)
            {
                if(a[i].charAt(j)=='S')
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int ans=0,count=0;
        for(int i=0;i<r;i++)
        {
            if(row.contains(i)==false)
            {
                ans+=c;
                count++;
            }
        }
        for(int i=0;i<c;i++)
        {
            if(col.contains(i)==false)
                ans=ans+r-count;
        }
        System.out.println(ans);
    }
}