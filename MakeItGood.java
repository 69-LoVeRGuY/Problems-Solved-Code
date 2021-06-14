import java.io.*;
import java.util.*;
public class MakeItGood
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int asc=0,des=0;
            int a[]=new int[n];
            int p=0,c=0;
            if(n==1)
            {
                int x=sc.nextInt();
                out.printLine(0);
                out.flush();
                continue;
            }
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(i!=0)
                {
                    if(a[i]>a[i-1])
                    {
                        asc++;
                        p=a[i-1];
                    }
                    else if(a[i]<a[i-1])
                    {
                        des++;
                        p=a[i-1];
                    }
                    else if(a[i]==a[i-1])
                    {
                        asc++;
                        des++;
                        if(i>1)
                            p=a[i-2];
                    }
                }
            }
            if(asc==n-1 || des==n-1)
            {
                out.printLine(0);
                out.flush();
                continue;
            }
            int count=0,i=n-1;
            if(a[i-1]<=a[i] && count==0 && p<a[i])
            {
                 while(i>0)
                 {
                     if(a[i-1]<=a[i])
                         count++;
                     else
                         break;
                     i--;
                 }
                 count++;
                 out.printLine(n-(count));
            }
            else
            {
                while(i>0)
                {
                    if(a[i-1]>=a[i])
                        count++;
                    else
                        break;
                    i--;
                }
                out.printLine(n-(2*count)-1);
            }
            out.flush();
        }
    }
}