// Everything is correct only one TLE due to CSES 
import java.io.*;
import java.util.*;
public class RestaurantCustomers
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
    static class Pair
    {
    	int a;
    	int b;
    	public Pair(int a, int b)
    	{
    		this.a=a;
    		this.b=b;
    	}
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int n=sc.nextInt();
        List<Pair> list=new ArrayList();
        TreeMap<Integer,Integer> leave=new TreeMap();
        int ans=Integer.MIN_VALUE,count=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(leave.containsKey(b))
                leave.put(b,leave.get(b)+1);
            else
                leave.put(b,1);
            Pair p=new Pair(a,b);
            list.add(p);
        }
        Collections.sort(list, new Comparator<Pair>(){
            public int compare(Pair x, Pair y)
            {
                return x.a-y.a;
            }
        });
        for(int i=0;i<n;i++)
        {
            Map.Entry<Integer,Integer> temp;
            count++;
            Pair p=list.get(i);
            temp=leave.lowerEntry(p.a+1);
            if(temp!=null)
            {
                count-=temp.getValue();
                leave.remove(temp.getKey());
            }
            if(count>ans)
                ans=count;
        }
        out.printLine(ans);
        out.flush();
    }
}