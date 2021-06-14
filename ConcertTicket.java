//Everything is correct only two TLE due to CSES
import java.io.*;
import java.util.*;
public class ConcertTicket
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
        TreeMap<Integer,Integer> price=new TreeMap();
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(price.containsKey(x))
                price.put(x,price.get(x)+1);
            else
                price.put(x,1);
        }
        for(int i=0;i<m;i++)
        {
            Integer x=sc.nextInt();
            Map.Entry<Integer,Integer> temp;
            temp=price.lowerEntry(x+1);
            if(temp!=null)
            {
                ans.append(temp.getKey());
                ans.append("\n");
                if(temp.getValue()==1)
                    price.remove(temp.getKey());
                else
                    price.put(temp.getKey(),temp.getValue()-1);
            }
            else
                ans.append("-1 \n");
        }
        out.printLine(ans);
        out.flush();
    }
}