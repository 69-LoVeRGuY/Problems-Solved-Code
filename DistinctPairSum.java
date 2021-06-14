import java.io.*;
import java.util.*;
public class DistinctPairSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=(r-l)+1+(r-l);
            System.out.println(ans);
        }
    }
}