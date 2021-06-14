import java.io.*;
import java.util.*;
public class CancelTheTrains
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            List<Integer> set1=new ArrayList();
            int count=0;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                set1.add(a);
            }
            for(int i=0;i<m;i++)
            {
                int a=sc.nextInt();
                if(set1.contains(a))
                    count++;
            }
            System.out.println(count);
        }
    }
}