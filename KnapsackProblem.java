import java.io.*;
import java.util.*;
public class KnapsackProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int maxw=sc.nextInt();
        int n=sc.nextInt();
        int w[]=new int[n];
        int value[]=new int[n];
        for(int i=0;i<n;i++)
            w[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            value[i]=sc.nextInt();
        int result[][]=new int[n+1][maxw+1];
        for(int i=0;i<=maxw;i++)
            result[0][i]=0;
        for(int i=0;i<=n;i++)
            result[i][0]=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=maxw;j++)
            {
                if(j<w[i])
                    result[i+1][j]=result[i][j];
                else if(j>=w[i])
                    result[i+1][j]=Math.max(result[i][j],(value[i]+result[i][j-w[i]]));
            }
        }
        System.out.println(result[n][maxw]);
    }
}