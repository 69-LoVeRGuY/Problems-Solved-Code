import java.io.*;
import java.util.*;
public class ChooseMe
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
    static class Pair
    {
        int p,q;
        Pair(int a, int b)
        {
            p=a;
            q=b;
        }
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        List<Pair> list=new ArrayList();
        long tota=0,totb=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            tota+=a;
            int b=sc.nextInt();
            Pair r=new Pair(a,b);
            list.add(r);
        }
        Collections.sort(list,new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2)
            {
                return p1.p-p2.p;
            }
            });
        for(int i=n-1;i>=0;i--)
        {
            Pair s=list.get(i);
            totb+=s.p+s.q;
            tota-=s.p;
            count++;
            if(tota<totb)
                break;
        }
        out.printLine(count);
        out.flush();
    }
}