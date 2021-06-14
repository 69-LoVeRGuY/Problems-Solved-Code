import java.io.*;
import java.util.*;
public class PuzzlePieces
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n==1 || m==1)
                System.out.println("YES");
            else if(n==2 && m==2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}