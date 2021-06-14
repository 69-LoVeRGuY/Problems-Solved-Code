import java.io.*;
import java.util.*;
public class ChefAndDragonDens
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
        int q=sc.nextInt();
        int h[]=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++)
            h[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            t[i]=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int type=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            b--;
            if(type==1)
                t[b]=c;
            else
            {
                c--;
                if(b==c)
                {
                    out.printLine(t[b]);
                    out.flush();
                }
                else if(h[b]<=h[c])
                {
                    out.printLine(-1);
                    out.flush();
                }
                else
                {
                    int d,prev=h[c],sum=0,f=0;
                    if(b<c)
                    {
                        d=c-1;
                        while(d>=b)
                        {
                            if(h[d]>prev && h[d]<h[b])
                            {
                                sum+=t[d];
                                prev=h[d];
                                d--;
                            }
                            else if(d==b && h[d]>prev)
                            {
                                sum+=t[d];
                                d--;
                            }
                            else if(h[d]>=h[b])
                            {
                                sum=-1;
                                f=-1;
                                break;
                            }
                            else
                                d--;
                        }
                        if(f==0)
                            sum=sum+t[c];
                    }
                    else
                    {
                        d=c+1;
                        while(d<=b)
                        {
                            if(h[d]>prev && h[d]<h[b])
                            {
                                sum+=t[d];
                                prev=h[d];
                                d++;
                            }
                            else if(d==b && h[d]>prev)
                            {
                                sum+=t[d];
                                d++;
                            }
                            else if(h[d]>=h[b])
                            {
                                sum=-1;
                                f=-1;
                                break;
                            }
                            else
                                d++;
                        }
                        if(f==0)
                            sum=sum+t[c];
                    }
                    out.printLine(sum);
                    out.flush();
                }
            }
        }
    }
}