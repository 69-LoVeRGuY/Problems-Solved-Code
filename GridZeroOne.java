import java.io.*;
import java.util.*;
public class GridZeroOne
{
    static class OutputWriter 
    {
        private final PrintWriter writer;
        
        public OutputWriter(OutputStream outputStream) 
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public OutputWriter(Writer writer) 
        {
            this.writer = new PrintWriter(writer);
        }
        
        public void print(Object...objects) 
        {
            for (int i = 0; i < objects.length; i++) 
            {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }
        
        public void printLine(Object...objects) 
        {
            print(objects);
            writer.println();
        }
        
        public void close() 
        {
            writer.close();
        }
        
        public void flush() {
            writer.flush();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[][]=new int[n][n];
            if(k==0)
                out.printLine(0);
            else if(k<n)
            {
                out.printLine(2);
                for(int i=0;i<k;i++)
                {
                    for(int j=0;j<k;j++)
                    {
                        if(i==j)
                            a[i][j]=1;
                    }
                }
            }
            else if(k%n==0)
            {
                out.printLine(0);
                int q=k/n;
                for(int i=0;i<n;i++)
                {
                    int start=i;
                    for(int j=0;j<q;j++)
                    {
                        a[i][start]=1;
                        if(start==n-1)
                            start=0;
                        else
                            start++;
                    }
                }
            }
            else if(k>n)
            {
                int q=k/n;
                int r=k%n;
                out.printLine(2);
                for(int i=0;i<r;i++)
                {
                    int start=i;
                    for(int j=0;j<q+1;j++)
                    {
                        a[i][start]=1;
                        if(start==n-1)
                            start=0;
                        else
                            start++;
                    }
                }
                for(int i=r;i<n;i++)
                {
                    int start=i;
                    for(int j=0;j<q;j++)
                    {
                        a[i][start]=1;
                        if(start==n-1)
                            start=0;
                        else
                            start++;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    out.print(a[i][j]);
                }
                out.printLine();
            }
            out.flush();
        }
    }
}