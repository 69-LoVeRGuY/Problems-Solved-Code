import java.io.*;
import java.util.*;
public class MovieFestival
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
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            Pair s=new Pair(p,q);
            list.add(s);
        }
        Collections.sort(list, new Comparator<Pair> () {
            public int compare(Pair x, Pair y)
            {
                return x.b-y.b;
            }
        });
        int ans=0,last=-1;
        for(int i=0;i<n;i++)
        {
            Pair p=list.get(i);
            if(p.a>=last)
            {
                ans++;
                last=p.b;
            }
        }
        out.printLine(ans);
        out.flush();
    }
}