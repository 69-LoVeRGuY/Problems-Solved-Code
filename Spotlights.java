import java.io.*;
import java.util.*;
public class Spotlights
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
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        long ans=0;
        HashMap<Integer,List<Integer>> map1=new HashMap();
        HashMap<Integer,List<Integer>> map2=new HashMap();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==1)
                {
                    if(map1.containsKey(i))
                    {
                        List<Integer> list=map1.get(i);
                        list.add(j);
                        map1.put(i,list);
                    }
                    else
                    {
                        List<Integer> list=new ArrayList();
                        list.add(j);
                        map1.put(i,list);
                    }
                    if(map2.containsKey(j))
                    {
                        List<Integer> list=map2.get(j);
                        list.add(i);
                        map2.put(j,list);
                    }
                    else
                    {
                        List<Integer> list=new ArrayList();
                        list.add(i);
                        map2.put(j,list);
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==0)
                {
                    if(map1.get(i)!=null)
                    {
                        if(map1.get(i).get(0)<j)
                            ans++;
                    }
                    if(map1.get(i)!=null)
                    {
                        if(map1.get(i).get(map1.get(i).size()-1)>j)
                            ans++;
                    }
                    if(map2.get(j)!=null)
                    {
                        if(map2.get(j).get(0)<i)
                            ans++;
                    }
                    if(map2.get(j)!=null)
                    {
                        if(map2.get(j).get(map2.get(j).size()-1)>i)
                            ans++;
                    }
                }
            }
        }
        out.printLine(ans);
        out.flush();
    }
}