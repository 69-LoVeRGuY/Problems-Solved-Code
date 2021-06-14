import java.io.*;
import java.util.*;
public class AllTheVowels
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
    static int[] factors(int k)
    {
        int a[]=new int[2];
        int b=0,c=0;
        for(int i=2;i*i<=k;i++)
        {
            if(k%i==0 && i>=5 && (k/i)>=5)
            {
                b=i;
                c=k/i;
                break;
            }
        }
        if(b>0 && c>0)
        {
            a[0]=b;
            a[1]=c;
        }
        else
        {
            a[0]=0;
            a[1]=0;
        }
        return a;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int k=sc.nextInt();
        if(k<25)
        {
            out.printLine(-1);
            out.flush();
            System.exit(0);
        }
        int fac[]=factors(k);
        if(fac[0]==0 && fac[1]==0)
        {
            out.printLine(-1);
            out.flush();
        }
        else
        {
            String s="",r="";
            String take="aeiou";
            int c=0;
            for(int i=0;i<Math.min(fac[0],fac[1]);i++)
            {
                r=r+take.charAt(c);
                c++;
                if(c==5)
                    c=0;
            }
            s=s+r;
            for(int i=1;i<Math.max(fac[0],fac[1]);i++)
            {
                String temp=r.substring(1)+r.charAt(0);
                s=s+temp;
                r=temp;
            }
            out.printLine(s);
            out.flush();
        }
    }
}