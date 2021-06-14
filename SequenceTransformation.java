import java.io.*;
import java.util.*;
public class SequenceTransformation
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            HashMap<Integer,List<Integer>> map=new HashMap();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(map.containsKey(a[i]))
                {
                    List<Integer> list=map.get(a[i]);
                    list.add(i);
                    map.put(a[i],list);
                }
                else
                {
                    List<Integer> list=new ArrayList();
                    list.add(i);
                    map.put(a[i],list);
                }
            }
            List<Integer> ans=new ArrayList();
            for(Map.Entry<Integer,List<Integer>> entry : map.entrySet())
            {
                int count=0;
                List<Integer> s=entry.getValue();
                for(int i=0;i<s.size();i++)
                {
                    if(i==0 && s.get(i)>0)
                        count++;
                    if(i==s.size()-1 && s.get(i)!=n-1)
                        count++;
                    if(i>0)
                    {
                        if(s.get(i)-s.get(i-1)>1)
                            count+=1;
                    }
                }
                ans.add(count);
            }
            Collections.sort(ans);
            out.printLine(ans.get(0));
            out.flush();
        }
    }
}