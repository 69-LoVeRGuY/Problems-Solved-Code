import java.io.*;
import java.util.*;
public class DubiousCrypto
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
               long l=sc.nextLong();
               long r=sc.nextLong();
               long m=sc.nextLong();
               long a=0,b=0,c=0;
               if(m==1)
               {
                   a=l;
                   b=l;
                   c=(2*l)-1;
               }
               else if(m<l)
               {
                   a=l;
                   b=l;
                   c=l+(l-m);
               }
               else
               {
                   long g=l;
                   while(true)
                   {
                       if((m-1)%g==0 && (r-g)>=0)
                       {
                           if((r-g)>0)
                           {
                               a=g;
                               b=g+1;
                               c=g;
                           }
                           else
                           {
                               a=g;
                               b=l+1;
                               c=l;
                           }
                           break;
                       }
                       else if((m+1)%g==0 && (r-g)>=0)
                       {
                           if((r-g)>0)
                           {
                               a=g;
                               b=g;
                               c=g+1;
                           }
                           else
                           {
                               a=g;
                               b=l;
                               c=l+1;
                           }
                           break;
                       }
                       else if(l+(m%g)>=l && l+(m%g)<=r)
                       {
                           a=g;
                           b=l+(m%g);
                           c=l;
                           break;
                       }
                       else if(l+((g*((m/g)+1))-m)>=l && (l+((g*((m/g)+1))-m))<=r)
                       {
                           a=g;
                           b=l;
                           c=l+((g*((m/g)+1))-m);
                           break;
                       }
                       else
                            g++;
                   }
               }
               out.printLine(a + " " + b + " " + c);
               out.flush();
        }
    }
}