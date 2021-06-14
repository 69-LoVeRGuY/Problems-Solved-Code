import java.io.*;
import java.util.*;
public class MaxWidth
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
        FastReader sc=new FastReader(); // s=abaab,t=abb
        Output out=new Output(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        HashMap<Character,List<Integer>> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                List<Integer> list=map.get(ch);
                list.add(i);
                map.put(ch,list);
            }
            else
            {
                List<Integer> list=new ArrayList();
                list.add(i);
                map.put(ch,list);
            }
        }
        for(Map.Entry<Character,List<Integer>> entry : map.entrySet())
        {
            List<Integer> l=entry.getValue();
            Collections.sort(l);
            map.put(entry.getKey(),l);
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<m;i++)
        {
            if(map.containsKey(t.charAt(i))==false || map.containsKey(t.charAt(i-1))==false)
                break;
            List<Integer> l1=map.get(t.charAt(i));
            List<Integer> l2=map.get(t.charAt(i-1));
            int diff=l1.get(l1.size()-1)-l2.get(0);
            if(diff>max)
                max=diff;
        }
        if(max<0 && map.containsKey(t.charAt(0)))
        {
            List<Integer> l=map.get(t.charAt(0));
            max=l.get(l.size()-1)-l.get(0);
        }
        max=Math.max(0,max);
        out.printLine(max);
        out.flush();
    }
}