import java.io.*;
import java.util.*;
public class ECF109D
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
        TreeMap<Integer,Integer> map=new TreeMap();
        TreeMap<Integer,Integer> map1=new TreeMap();
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a==1)
                list.add(i+1);
            else
            {
                map.put(i+1,1);
                map1.put(i+1,1);
            }
        }
        int ans=0,ans1=0;
        for(int i=0;i<list.size();i++)
        {
            Map.Entry<Integer,Integer> low=map.lowerEntry(list.get(i));
            Map.Entry<Integer,Integer> high=map.higherEntry(list.get(i));
            if(low==null)
            {
                ans+=Math.abs(list.get(i)-high.getKey());
                map.remove(high.getKey());
            }
            else if(high==null)
            {
                ans+=Math.abs(list.get(i)-low.getKey());
                map.remove(low.getKey());
            }
            else
            {
                int lower=Math.abs(list.get(i)-low.getKey());
                int higher=Math.abs(list.get(i)-high.getKey());
                ans+=Math.min(lower,higher);
                if(lower<=higher)
                    map.remove(low.getKey());
                else
                    map.remove(high.getKey());
            }
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            Map.Entry<Integer,Integer> low=map1.lowerEntry(list.get(i));
            Map.Entry<Integer,Integer> high=map1.higherEntry(list.get(i));
            if(high==null)
            {
                ans1+=Math.abs(list.get(i)-low.getKey());
                map1.remove(low.getKey());
            }
            else if(low==null)
            {
                ans1+=Math.abs(list.get(i)-high.getKey());
                map1.remove(high.getKey());
            }
            else
            {
                int lower=Math.abs(list.get(i)-low.getKey());
                int higher=Math.abs(list.get(i)-high.getKey());
                ans1+=Math.min(lower,higher);
                if(higher<=lower)
                    map1.remove(high.getKey());
                else
                    map1.remove(low.getKey());
            }
        }
        ans=Math.min(ans,ans1);
        out.printLine(ans);
        out.flush();
    }
}