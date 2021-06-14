import java.io.*;
import java.util.*;
public class ECF105A
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
            String s=sc.next();
            int n=s.length();
            if(s.charAt(0)==s.charAt(n-1))
            {
                out.printLine("NO");
                out.flush();
                continue;
            }
            char start=s.charAt(0);
            char end=s.charAt(n-1);
            char arr[]=new char[n];
            Arrays.fill(arr,'a');
            int open=0,close=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)==start)
                {
                    arr[i]='(';
                    open++;
                }
                else if(s.charAt(i)==end)
                {
                    arr[i]=')';
                    close++;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]=='a' && open>=close)
                    arr[i]=')';
                else if(arr[i]=='a' && close>open)
                    arr[i]='(';
            }
            Stack<Character> stack=new Stack();
            int f=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]=='(')
                    stack.push('(');
                else
                {
                    if(stack.isEmpty())
                    {
                        f=-1;
                        break;
                    }
                    else
                        stack.pop();
                }
            }
            if(f==-1 || stack.isEmpty()==false)
                out.printLine("NO");
            else
                out.printLine("YES");
            out.flush();
        }
    }
}