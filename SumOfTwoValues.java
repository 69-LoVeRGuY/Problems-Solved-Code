import java.io.*;
import java.util.*;
public class SumOfTwoValues
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
        int x=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,List<Integer>> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(map.containsKey(a[i]))
            {
                List<Integer> list=map.get(a[i]);
                list.add(i+1);
                map.put(a[i],list);
            }
            else
            {
                List<Integer> list=new ArrayList();
                list.add(i+1);
                map.put(a[i],list);
            }
        }
        for(int i=0;i<n;i++)
        {
            int diff=x-a[i];
            if(diff==a[i] && map.get(diff).size()>1)
            {
                List<Integer> list=map.get(diff);
                out.printLine(list.get(0)+" "+list.get(1));
                out.flush();
                System.exit(0);
            }
            if(map.containsKey(diff) && diff!=a[i])
            {
                out.printLine((i+1)+" "+(map.get(diff).get(0)));
                out.flush();
                System.exit(0);
            }
        }
        out.printLine("IMPOSSIBLE");
        out.flush();
    }
}