import java.io.*;
import java.util.*;
public class Charges
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
            int k=sc.nextInt();
            String s=sc.next();
            int ans=0;
            for(int i=0;i<n-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                    ans+=2;
                else
                    ans++;
            }
            char ch[]=s.toCharArray();
            for(int i=0;i<k;i++)
            {
                int pos=sc.nextInt();
                pos--;
                if(ch[pos]=='1')
                {
                    ch[pos]='0';
                    if(pos-1>=0)
                    {
                        if(ch[pos-1]=='1')
                            ans--;
                        else
                            ans++;
                    }
                    if(pos+1<n)
                    {
                        if(ch[pos+1]=='1')
                            ans--;
                        else
                            ans++;
                    }
                }
                else
                {
                    ch[pos]='1';
                    if(pos-1>=0)
                    {
                        if(ch[pos-1]=='0')
                            ans--;
                        else
                            ans++;
                    }
                    if(pos+1<n)
                    {
                        if(ch[pos+1]=='0')
                            ans--;
                        else
                            ans++;
                    }
                }
                out.printLine(ans);
                out.flush();
            }
        }
    }
}