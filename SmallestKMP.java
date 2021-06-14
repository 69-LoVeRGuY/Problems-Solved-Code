import java.io.*;
import java.util.*;
public class SmallestKMP
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
    static int count=0;
    static int find(int a[], char X)
    {
        int result=0;
        for(int i=X;i>=97;i--)
        {
            if(a[i]>0)
            {
                result=i;
                count=a[i];
                break;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            String p=sc.next();
            StringBuilder str1=new StringBuilder(s);
            StringBuilder str2=new StringBuilder(p);
            int c=0,f=0;
            int a[]=new int[123];
            while(str2.length()>0)
            {
                char ch=str2.charAt(c);
                int pos=str1.indexOf(String.valueOf(ch));
                str1.deleteCharAt(pos);
                str2.deleteCharAt(c);
            }
            String r=str1.toString();
            for(int i=0;i<r.length();i++)
                a[r.charAt(i)]++;
            char arr[]=r.toCharArray();
            Arrays.sort(arr);
            StringBuilder ans=new StringBuilder(String.valueOf(arr));
            char g=(char)find(a,p.charAt(0));
            int l=ans.lastIndexOf(String.valueOf(g));
            StringBuilder alt=new StringBuilder(ans);
            if(g==p.charAt(0))
            {
                f=l-(count-1);
                if(f<0)
                    f=0;
                alt.insert(f,p);
                ans.insert(l+1,p);
                String y=String.valueOf(alt);
                String z=String.valueOf(ans);
                if(y.compareTo(z)>=0)
                    out.printLine(z);
                else
                    out.printLine(y);
            }
            else
            {
                ans.insert(l+1, p);
                out.printLine(ans);
            }
            out.flush();
        }
    }
}