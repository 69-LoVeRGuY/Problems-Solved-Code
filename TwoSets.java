import java.io.*;
import java.util.*;
public class TwoSets
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
        long n=sc.nextLong();
        long sum=(n*(n+1))/4;
        long supersum=0,c=1;
        if((n*(n+1))%4!=0)
        {
            out.printLine("NO");
            out.flush();
            System.exit(0);
        }
        HashSet<Long> set=new HashSet();
        HashSet<Long> set1=new HashSet();
        for(long i=1;i<=n;i++)
            set.add(i);
        if(sum%n==0)
        {
            set1.add(n);
            set.remove(n);
            supersum+=n;
        }
        while(supersum!=sum)
        {
            if(sum%n==0)
            {
                set1.add(c);
                set1.add(n-c);
                set.remove(c);
                set.remove(n-c);
                supersum+=n;
            }
            else
            {
                set1.add(n-c+1);
                set1.add(c);
                set.remove(n-c+1);
                set.remove(c);
                supersum+=n+1;
            }
            c++;
        }
        out.printLine("YES");
        out.printLine(set1.size());
        Iterator itr=set1.iterator();
        String x="",y="";
        while(itr.hasNext())
            x+=String.valueOf(itr.next())+" ";
        out.printLine(x);
        out.printLine(set.size());
        Iterator itr1=set.iterator();
        while(itr1.hasNext())
            y+=String.valueOf(itr1.next())+" ";
        out.printLine(y);
        out.flush();
    }
}