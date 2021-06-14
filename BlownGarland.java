import java.io.*;
import java.util.*;
public class BlownGarland
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
        String s=sc.next();
        if(s.contains("!")==false)
        {
            out.printLine(0+" "+0+" "+0+" "+0);
            out.flush();
            System.exit(0);
        }
        int c[]=new int[91];
        while(s.contains("!"))
        {
            char ch[]=s.toCharArray();
            for(int i=0;i<s.length();i++)
            {
                if(ch[i]=='!')
                {
                    if((i+4)<=s.length()-1 && ch[i+4]!='!')
                    {
                        ch[i]=ch[i+4];
                        c[ch[i+4]]++;
                    }
                    else if((i-4)>=0 && ch[i-4]!='!')
                    {
                        ch[i]=ch[i-4];
                        c[ch[i-4]]++;
                    }
                }
            }
            s=String.valueOf(ch);
        }
        out.printLine(c[82]+" "+c[66]+" "+c[89]+" "+c[71]);
        out.flush();
    }
}