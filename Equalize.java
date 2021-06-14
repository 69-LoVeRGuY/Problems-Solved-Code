import java.io.*;
import java.util.*;
public class Equalize
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
    public static void main(String arg[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int n=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        if(a.equals(b))
        {
            System.out.println("0");
            System.exit(0);
        }
        int ans=0,diff=0,done=0,last=-1,prev=-1;
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                diff++;
                if(i>0)
                {
                    if(prev==i-1)
                    {
                        if((a.charAt(i)=='1' && last==0) || (a.charAt(i)=='0' && last==1))
                        {
                            ans++;
                            done+=2;
                            prev=-1;
                            last=-1;
                        }
                        else
                        {
                            prev=i;
                            if(a.charAt(i)=='1')
                                last=1;
                            else
                                last=0;
                        }
                    }
                    else
                    {
                        if(a.charAt(i)=='1')
                            last=1;
                        else
                            last=0;
                        prev=i;
                    }
                }
                else
                {
                    prev=i;
                    if(a.charAt(i)=='1')
                        last=1;
                    else
                        last=0;
                }
            }
        }
        ans+=(diff-done);
        out.printLine(ans);
        out.flush();
    }
}