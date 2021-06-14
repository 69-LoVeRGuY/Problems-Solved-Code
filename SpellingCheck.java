import java.io.*;
import java.util.*;
public class SpellingCheck
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
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()-s2.length()==0 || s1.length()-s2.length()>1)
        {
            out.printLine(0);
            out.flush();
            System.exit(0);
        }
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            c1[ch-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            c2[ch-'a']++;
        }
        int tdiff=0;
        for(int i=0;i<26;i++)
        {
            if(c2[i]>0 && c1[i]==0)
            {
                out.printLine(0);
                out.flush();
                System.exit(0);
            }
            tdiff+=c1[i]-c2[i];
            if(tdiff>1)
            {
                out.printLine(0);
                out.flush();
                System.exit(0);
            }
        }
        HashMap<Integer,Character> map=new HashMap();
        List<Integer> list=new ArrayList();
        int i=0,j=0;
        while(i<s2.length())
        {
            if(s1.charAt(j)!=s2.charAt(i))
            {
                map.put((j+1),s1.charAt(j));
                int f=j-1;
                while(f>=0)
                {
                    if(s1.charAt(f)==s1.charAt(j))
                    {
                        map.put(f+1,s1.charAt(f));
                        f--;
                    }
                    else
                        break;
                }
                j++;
            }
            else
            {
                i++;
                j++;
            }
            if(j>=s1.length() && i<s2.length())
            {
                out.printLine(0);
                out.flush();
                System.exit(0);
            }
        }
        if(j<s1.length())
        {
            map.put(j+1,s1.charAt(j));
            int f=j-1;
            while(f>=0)
            {
                if(s1.charAt(f)==s1.charAt(j))
                {
                    map.put(f+1,s1.charAt(f));
                    f--;
                }
                else
                    break;
            }
        }
        out.printLine(map.size());
        for(Map.Entry<Integer,Character> entry : map.entrySet())
            list.add(entry.getKey());
        Collections.sort(list);
        for(int k=0;k<list.size();k++)
            out.print(list.get(k)+" ");
        out.printLine();
        out.flush();
    }
}