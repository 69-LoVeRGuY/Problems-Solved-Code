import java.io.*;
import java.util.*;
public class CardDeck
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
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int p[]=new int[n];
            int sp[]=new int[100001];
            StringBuilder s=new StringBuilder("");
            StringBuilder ans=new StringBuilder();
            int prev=0;
            for(int i=0;i<n;i++)
            {
                p[i]=sc.nextInt();
                s.append(String.valueOf(p[i]));
                s.append(" ");
                sp[p[i]]=prev;
                prev=prev+String.valueOf(p[i]).length()+1;
            }
            int di[]=p.clone();
            Arrays.sort(di);
            int last=prev-1;
            for(int i=n-1;i>=0;i--)
            {
                int start=sp[di[i]];
                if(sp[di[i]]<=last)
                {
                    ans.append(s.substring(start,last));
                    ans.append(" ");
                    last=start-1;
                    if(last<0)
                        break;
                }
            }
            out.printLine(ans);
            out.flush();
        }
    }
}