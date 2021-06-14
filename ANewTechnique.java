import java.io.*;
import java.util.*;
public class ANewTechnique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            int b[][]=new int[m][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    a[i][j]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    b[i][j]=sc.nextInt();
            }
            int z[]=new int[m];
            List<Integer> list=new ArrayList();
            int c=0;
            while(c<n-1)
            {
                for(int i=0;i<m;i++)
                {
                    z[i]=b[i][c];
                    list.add(b[i][c]);
                }
                for(int i=0;i<n;i++)
                {
                    int count=0;
                    for(int j=0;j<m;j++)
                    {
                        if(list.contains(a[i][j]))
                            count++;
                        else
                            break;
                    }
                    if(count==m)
                    {
                        for(int j=0;j<m;j++)
                        {
                            System.out.print(a[i][j]+" "); 
                            a[i][j]=-1;
                        }
                        System.out.println();
                        c++;
                        list.clear();
                        break;
                    }
                    list.clear();
                }
            }
        }
    }
}   