import java.io.*;
import java.util.*;
public class AlyonaAndNumbers
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
      
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
      
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
      
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
      
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
      
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
      
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
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
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>m)
        {
            int temp=n;
            n=m;
            m=temp;
        }
        long count=0;
        int a[]=new int[10];
        int q=m/5;
        if(q==0 || q==1)
        {
            for(int i=1;i<=m;i++)
                a[i]++;
        }
        else if(q%2!=0)
        {
            for(int i=1;i<=5;i++)
                a[i]=a[i]+((q/2)+1);
            for(int i=6;i<=9;i++)
                a[i]=a[i]+(q/2);
            a[0]=a[0]+(q/2);
            for(int i=(5*q)+1;i<=m;i++)
            {
                int e=i%10;
                a[e]++;
            }
        }
        else
        {
            for(int i=0;i<=9;i++)
                a[i]=a[i]+(q/2);
            for(int i=(5*q)+1;i<=m;i++)
            {
                int e=i%10;
                a[e]++;
            }
        }
        for(int i=1;i<=n;i++)
        {
            int d=i%10;
            if(d==1 || d==6)
                count=count+a[4]+a[9];
            else if(d==2 || d==7)
                count=count+a[3]+a[8];
            else if(d==3 || d==8)
                count=count+a[2]+a[7];
            else if(d==4 || d==9)
                count=count+a[1]+a[6];
            else if(d==5 || d==0)
                count=count+a[0]+a[5];
        }
        out.printLine(count);
        out.flush();
    }
}