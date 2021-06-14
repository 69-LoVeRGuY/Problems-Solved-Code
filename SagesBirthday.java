import java.io.*;
import java.util.*;
public class SagesBirthday
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
    public static void main(String ags[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            list.add(a);
        }
        if(n%2==0)
            System.out.println((n-1)/2);
        else
            System.out.println(n/2);
        if(n==1)
        {
            System.out.println(list.get(0));
            System.exit(0);
        }
        if(n==2)
        {
            System.out.println(list.get(0)+" "+list.get(1));
            System.exit(0);
        }
        Collections.sort(list);
        Integer as[]=new Integer[list.size()];
        as=list.toArray(as);
        Integer des[]=as.clone();
        int i=0,j=list.size()-1,c=0;
        while(as[i]!=des[j])
        {
            if(c%2==0)
            {
                out.print(des[j]+" ");
                j--;
            }
            else
            {
                out.print(as[i]+" ");
                i++;
            }
            c++;
        }
        out.printLine(as[i]);
        out.flush();
    }
}