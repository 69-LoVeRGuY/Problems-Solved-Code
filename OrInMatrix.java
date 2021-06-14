import java.io.*;
import java.util.*;
public class OrInMatrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                b[i][j]=-1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==0)
                {
                    for(int k=0;k<m;k++)
                        b[i][k]=0;
                    for(int k=0;k<n;k++)
                        b[k][j]=0;
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(b[i][j]==-1)
                {
                    b[i][j]=1;
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]!=(row[i]|col[j]))
                {
                    c=-1;
                    break;
                }
            }
        }
        if(c==-1)
            System.out.println("NO");
        else
        {
            System.out.println("YES");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    System.out.print(b[i][j]+" ");
                System.out.println();
            }
        }
    }
}