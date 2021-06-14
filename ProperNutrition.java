import java.io.*;
import java.util.*;
public class ProperNutrition
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n<Math.min(a,b))
            out.printLine("NO");
        else if(n%a==0)
        {
            out.printLine("YES");
            out.printLine((n/a)+" "+0);
        }
        else if(n%b==0)
        {
            out.printLine("YES");
            out.printLine(0+" "+(n/b));
        }
        else
        {
            int f=0,num=0;
            int c=n;
            while(c>0)
            {
                if((c)%b==0)
                {
                    f=1;
                    num=c/b;
                    break;
                }
                else
                    c=c-a;
            }
            if(f==1)
            {
                out.printLine("YES");
                out.printLine((n-c)/a+" "+num);
            }
            else
            {
                int g=n,v=0;
                while(g>0)
                {
                    if((g)%a==0)
                    {
                        f=1;
                        v=g/a;
                        break;
                    }
                    else
                        g=g-b;
                }
                if(f==1)
                {
                    out.printLine("YES");
                    out.printLine(v+" "+(n-v)/b);
                }
                else
                    out.printLine("NO");
            }
        }
        out.flush();
    }
} 