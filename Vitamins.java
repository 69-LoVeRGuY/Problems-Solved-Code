import java.io.*;
import java.util.*;
public class Vitamins
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
        List<Integer> a=new ArrayList();
        List<Integer> b=new ArrayList();
        List<Integer> c=new ArrayList();
        List<Integer> ab=new ArrayList();
        List<Integer> bc=new ArrayList();
        List<Integer> ac=new ArrayList();
        List<Integer> abc=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            String s=sc.next();
            int l=s.length();
            if(l==1 && s.equals("A"))
                a.add(p);
            else if(l==1 && s.equals("B"))
                b.add(p);
            else if(l==1 && s.equals("C"))
                c.add(p);
            else if(l==2 && s.contains("A") && s.contains("B"))
                ab.add(p);
            else if(l==2 && s.contains("B") && s.contains("C"))
                bc.add(p);
            else if(l==2 && s.contains("A") && s.contains("C"))
                ac.add(p);
            else
                abc.add(p);
        }
        List<Integer> result=new ArrayList();
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);
        Collections.sort(ab);
        Collections.sort(ac);
        Collections.sort(bc);
        Collections.sort(abc);
        if(abc.size()!=0)
            result.add(abc.get(0));
        if(a.size()!=0 && b.size()!=0 && c.size()!=0)
            result.add((a.get(0)+b.get(0)+c.get(0)));
        if(a.size()!=0 && bc.size()!=0)
            result.add(a.get(0)+bc.get(0));
        if(b.size()!=0 && ac.size()!=0)
            result.add(b.get(0)+ac.get(0));
        if(c.size()!=0 && ab.size()!=0)
            result.add(c.get(0)+ab.get(0));
        if(ab.size()!=0 && bc.size()!=0)
            result.add(ab.get(0)+bc.get(0));
        if(ab.size()!=0 && ac.size()!=0)
            result.add(ab.get(0)+ac.get(0));
        if(bc.size()!=0 && ac.size()!=0)
            result.add(bc.get(0)+ac.get(0));
        if(result.size()==0)
            out.printLine(-1);
        else
        {
            Collections.sort(result);
            out.printLine(result.get(0));
        }
        out.flush();
    }
}