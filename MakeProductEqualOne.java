import java.io.*;
import java.util.*;
public class MakeProductEqualOne
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int neg=0,z=0,mo=0;
        long count=0;
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                count=count+Math.abs(a[i]-(-1));
                mo++;
            }
            if(a[i]==0 && mo%2!=0)
            {
                count++;
                mo--;
            }
            else if(a[i]==0)
                count++;
            else if(a[i]>0)
                count+=a[i]-1;
        }
        if(mo%2!=0)
            count+=2;
        System.out.println(count);
    }
}