import java.io.*;
import java.util.*;
public class DivisibilityDifference
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
        int k=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int r[]=new int[n];
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            r[i]=a[i]%m;
            if(map.containsKey(r[i]))
            {
                map.put(r[i],map.get(r[i])+1);
                if(map.get(r[i])==k)
                    ans=r[i];
            }
            else
                map.put(r[i],1);
        }
        if(ans==-1)
            out.printLine("No");
        else
        {
            out.printLine("Yes");
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(r[i]==ans)
                {
                    out.print(a[i]+" ");
                    c++;
                }
                if(c==k)
                    break;
            }
            out.printLine();
        }
        out.flush();
    }
}