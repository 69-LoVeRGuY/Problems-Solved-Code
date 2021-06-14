import java.io.*;
import java.util.*;
public class SortTheArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int b[]=a.clone();
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.println("yes");
            System.out.println(1+" "+1);
            System.exit(0);
        }
        List<Integer> l=new ArrayList();
        List<Integer> index=new ArrayList();
        int first=0,last=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]!=b[i])
            {
                last=i;
                break;
            }
        }
        for(int i=first;i<=last;i++)
            l.add(a[i]);
        int x=l.size()-1;
        for(int i=first;i<=last;i++)
        {
            a[i]=l.get(x);
            x--;
        }
        if(Arrays.equals(a,b))
        {
            System.out.println("yes");
            System.out.println((first+1)+" "+(last+1));
        }
        else
            System.out.println("no");
    }
}