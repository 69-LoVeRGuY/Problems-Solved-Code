import java.io.*;
import java.util.*;
public class RestorePermutation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashSet<Integer> hs=new HashSet();
            int b[]=new int[n];
            int c=0;
            for(int i=0;i<2*n;i++)
            {
                int a=sc.nextInt();
                if(hs.contains(a)==false)
                {
                    b[c]=a;
                    c++;
                    hs.add(a);
                }
            }
            for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}