import java.io.*;
import java.util.*;
public class CoprimeArray
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
    static int factors(int a, int b)
    {
        int f=0;
        if(a>b)
        {
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                if(b%i==0)
                {
                    f++;
                    break;
                }
                else if(b%(a/i)==0)
                {
                    f++;
                    break;
                }
            }
        }
        if(b%a==0 && a!=1)
            f++;
        return f;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            list.add(a);
        }
        int i=0,count=0;
        while(i<list.size()-1)
        {
            int f=factors(list.get(i),list.get(i+1));
            if(f>0)
            {
                list.add(i+1,1);
                count++;
                i+=2;
            }
            else
                i++;
        }
        out.printLine(count);
        Integer b[]=new Integer[list.size()];
        b=list.toArray(b);
        for(int j=0;j<b.length;j++)
            out.print(b[j]+" ");
        out.printLine();
        out.flush();
    }
}
 