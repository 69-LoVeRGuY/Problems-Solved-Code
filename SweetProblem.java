import java.io.*;
import java.util.*;
public class SweetProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int c[]=new int[3];
            for(int j=0;j<3;j++)
                c[j]=sc.nextInt();
            Arrays.sort(c);
            if(c[0]+c[1]>=c[2])
                System.out.println((c[0]+c[1]+c[2])/2);
            else
                System.out.println(c[0]+c[1]);
        }
    }
}