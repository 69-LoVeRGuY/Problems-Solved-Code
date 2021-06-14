import java.io.*;
import java.util.*;
public class Apartments
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
    static class Output 
    {
        private final PrintWriter writer;
        
        public Output(OutputStream outputStream) 
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        
        public Output(Writer writer) 
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
        Output out=new Output(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long k=sc.nextLong();
        List<Long> a=new ArrayList();
        List<Long> b=new ArrayList();
        int ans=0;
        for(int i=0;i<n;i++)
            a.add(sc.nextLong());
        for(int i=0;i<m;i++)
            b.add(sc.nextLong());
        Collections.sort(a);
        Collections.sort(b);
        int i=n-1,j=m-1;
        while(i>=0 && j>=0)
        {
            if((a.get(i)==b.get(j)) || (b.get(j)>=a.get(i)-k && b.get(j)<=a.get(i)+k))
            {
                ans++;
                i--;
                j--;
            }
            else if(b.get(j)>a.get(i)+k)
                j--;
            else if(b.get(j)<a.get(i)-k)
                i--;
        }
        out.printLine(ans);
        out.flush();
    }
}