import java.io.*;
import java.util.*;
public class FoxDividingCheese
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
    static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    static int pfactorization(int x)
    {
        int f=0;
        while(x%2==0)
        {
            f++;
            x=x/2;
        }
        for(int i=3;i<=x;i+=2)
        {
            if(x%i==0)
            {
                if(i>5)
                {
                    f=-1;
                    break;
                }
                else
                {
                    while(x%i==0)
                    {
                        f++;
                        x/=i;
                    }
                }
            }
        }
        return f;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
            out.printLine(0);
            out.flush();
            System.exit(0);
        }
        if(a%2!=0 && a%3!=0 && a%5!=0 && b%2!=0 && b%3!=0 && b%5!=0)
        {
            out.printLine(-1);
            out.flush();
            System.exit(0);
        }
        int hcf=gcd(a,b);
        int count=0;
        int ac=a/hcf,bc=b/hcf;
        int ar=pfactorization(ac);
        int br=pfactorization(bc);
        if(a%hcf==0 && b%hcf==0 && ar!=-1 && br!=-1)
            out.printLine(ar+br);
        else
            out.printLine(-1);
        out.flush();
    }
}