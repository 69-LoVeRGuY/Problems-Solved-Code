import java.io.*;
import java.util.*;
public class CopyCopy
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            HashSet<Integer> a=new HashSet<>();
            for(int j=0;j<n;j++)
            {
                a.add(sc.nextInt());
            }
            System.out.println(a.size());
        }
    }
}