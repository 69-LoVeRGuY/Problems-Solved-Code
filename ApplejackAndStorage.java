import java.io.*;
import java.util.*;
public class ApplejackAndStorage
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap();
        HashMap<Integer,Integer> clone=new HashMap();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
                clone.put(a,clone.get(a)+1);
            }
            else
            {
                map.put(a,1);
                clone.put(a,1);
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            char ch=sc.next().charAt(0);
            int x=sc.nextInt();
            if(ch=='+')
            {
                if(map.containsKey(x))
                {
                    map.put(x,map.get(x)+1);
                    clone.put(x,clone.get(x)+1);
                }
                else
                {
                    map.put(x,1);
                    clone.put(x,1);
                }
            }
            else
            {
                if(map.containsKey(x))
                {
                    map.put(x,map.get(x)-1);
                    clone.put(x,clone.get(x)-1);
                }
            }
            int c=0,f=0;
            for(Map.Entry<Integer,Integer> entry : clone.entrySet())
            {
                if(entry.getValue()>=4)
                {
                    c++;
                    entry.setValue(entry.getValue()-4);
                }
                if(entry.getValue()>=4)
                {
                    c++;
                    entry.setValue(entry.getValue()-4);
                }
                if(entry.getValue()>=2)
                {
                    f++;
                    entry.setValue(entry.getValue()-2);
                }
                if(f==2)
                    c++;
                if(c>=2)
                    break;
            }
            if(c>=2)
                out.printLine("YES");
            else
                out.printLine("NO");
            out.flush();
            clone.clear();
            clone.putAll(map);
        }
    }
}