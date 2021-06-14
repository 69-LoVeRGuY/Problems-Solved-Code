import java.io.*;
import java.util.*;
public class Valeri
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashSet<Integer> set=new HashSet();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                set.add(a);
            }
            if(set.size()==n)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}