import java.io.*;
import java.util.*;
public class PalindromeReorder
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
        String s=sc.next();
        int n=s.length();
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            a[ch-65]++;
        }
        int odd=0,p=-1,c=0;
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
                continue;
            if(a[i]%2==1)
            {
                odd++;
                p=i;
            }
        }
        if((s.length()%2==0 && odd!=0) || (s.length()%2==1 && odd>1))
        {
            out.printLine("NO SOLUTION");
            out.flush();
            System.exit(0);
        }
        char q[]=new char[n];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(a[ch-65]>1)
            {
                q[c]=ch;
                q[n-1-c]=ch;
                a[ch-65]-=2;
                c++;
            }
        }
        if(p!=-1)
            q[n/2]=(char)(p+65);
        ans.append(String.valueOf(q));
        out.printLine(ans);
        out.flush();
    }
}