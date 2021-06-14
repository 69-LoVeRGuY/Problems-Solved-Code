import java.io.*;
import java.util.*;
public class ArrayCancellation
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
            HashMap<Integer,Integer> map=new HashMap();
            List<Integer> list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]<0)
                {
                    map.put(i,a[i]);
                    list.add(i);
                }
            }
            int i=0;
            long ans=0;
            while(i<n)
            {
                if(a[i]>0 && list.size()>0)
                {
                    int r=Math.abs(map.get(list.get(0)));
                    if(r==a[i] && list.get(0)>i)
                    {
                        a[i]=0;
                        a[list.get(0)]=0;
                        list.remove(0);
                        i++;
                    }
                    else if(r>a[i] && list.get(0)>i)
                    {
                        map.put(list.get(0),(map.get(list.get(0))+a[i]));
                        a[list.get(0)]=a[list.get(0)]+a[i];
                        i++;
                    }
                    else if(r<a[i] && list.get(0)>i)
                    {
                        a[i]=a[i]+map.get(list.get(0));
                        a[list.get(0)]=0;
                        list.remove(0);
                    }
                    else
                        list.remove(0);
                }
                else if(a[i]>0 && list.size()==0)
                    break;
                else
                    i++;
            }
            Arrays.sort(a);
            for(int j=0;j<n;j++)
            {
                if(a[j]<0)
                    ans=ans+Math.abs(a[j]);
                else
                    break;
            }
            out.printLine(ans);
            out.flush();
        }
    }
}
   