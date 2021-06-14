import java.io.*;
import java.util.*;
public class YetAnotherBrokenKeyboard
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
        long n=sc.nextLong();
        int k=sc.nextInt();
        String s=sc.next();
        int a[]=new int[123];
        long ans=(n*(n+1))/2;
        for(int i=0;i<k;i++)
        {
            String ch=sc.next();
            int c=(int)ch.charAt(0);
            a[c]++;
        }
        String r="";
        List<Integer> al=new ArrayList();
        for(int i=97;i<=122;i++)
        {
            if(a[i]==0)
            {
                char d=(char)i;
                r=r+String.valueOf(d);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(r.contains(String.valueOf(s.charAt(i))))
                    al.add(i);
        }
        Integer b[]=new Integer[al.size()];
        b=al.toArray(b);
        if(al.size()==0)
            out.printLine(ans);
        else if(al.size()==n)
            out.printLine(0);
        else
        {
            int prev=0;
            for(int i=0;i<b.length;i++)
            {
                ans=ans-(s.length()-b[i]);
                while(prev!=b[i])
                {
                    ans=ans-(s.length()-(b[i]-prev)-prev);
                    prev++;
                }
                prev+=1;
            }
            out.printLine(ans);
        }
        out.flush();
    }
}