import java.io.*;
import java.util.*;
public class NonZeroSegment
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<0)
                list.add(i);
        }
        Integer pos[]=new pos[list.size()];
        pos=list.toArray(pos);
        for(int i=0