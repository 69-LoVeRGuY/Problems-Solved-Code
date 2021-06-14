import java.io.*;
import java.util.*;
public class CampSchedule
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
    public static void main(String args[])                                               //TC--> 111110000 1010101
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        String s=sc.next();
        String t=sc.next();
        StringBuilder ans=new StringBuilder();
        HashMap<Integer,Integer> map1=new HashMap();
        HashMap<Integer,Integer> map2=new HashMap();
        map1.put(1,0);
        map1.put(0,0);
        map2.put(1,0);
        map2.put(0,0);
        int count=0,one=0,zero=0;
        for(int i=0;i<s.length();i++)
        {
            int d=Integer.parseInt(String.valueOf(s.charAt(i)));
            int val=map1.getOrDefault(d,0);
            map1.put(d,val+1);
        }
        for(int i=0;i<t.length();i++)
        {
            int d=Integer.parseInt(String.valueOf(t.charAt(i)));
            int val=map2.getOrDefault(d,0);
            map2.put(d,val+1);
        }
        if(s.contains(String.valueOf(t.charAt(0)))==false || t.contains(String.valueOf(s.charAt(0)))==false)
        {
            out.printLine(s);
            out.flush();
            System.exit(0);
        }
        for(int i=0;i<t.length()/2;i++)
        {
            if(t.charAt(i)==t.charAt(t.length()-1-i))
            {
                count++;
                if(t.charAt(i)=='1')
                    one++;
                else
                    zero++;
                if(i==((t.length()/2)-1) && t.charAt(i+1)==t.charAt(0) && (t.length()%2==1))
                {
                    if(t.charAt(i+1)=='1')
                        one++;
                    else
                        zero++;
                    count++;
                }
            }
            else 
                break;
        }
        if(count==0)
        {
            int c1=0,c2=0;
            if(map2.get(1)>0)
                c1=map1.get(1)/map2.get(1);
            if(map2.get(0)>0)
                c2=map1.get(0)/map2.get(0);
            int min=Math.min(c1,c2);
            int max=Math.max(c1,c2);
            for(int i=0;i<min;i++)
                ans=ans.append(t);
            if(c1==min)
            {
                map1.put(1,(map1.get(1)-(c1*map2.get(1))));
                map1.put(0,(map1.get(0)-(c1*map2.get(0))));
            }
            else
            {
                map1.put(1,(map1.get(1)-(c2*map2.get(1))));
                map1.put(0,(map1.get(0)-(c2*map2.get(0))));
            }
        }
        else
        {
            ans=ans.append(t);
            map1.put(1,(map1.get(1)-map2.get(1)));
            map1.put(0,(map1.get(0)-map2.get(0)));
            int val1=0,val2=0,sone=0,szero=0;
            for(int i=count;i<t.length();i++)
            {
                if(t.charAt(i)=='1')
                    sone++;
                else
                    szero++;
            }
            if(map1.get(1)>=sone && map1.get(0)>=szero)
            {
                if(map2.get(1)-one>0)
                    val1=map1.get(1)/(map2.get(1)-one);
                if(map2.get(0)-zero>0)
                    val2=map1.get(0)/(map2.get(0)-zero);
                int min=Math.min(val1,val2);
                int g=0;
                for(int i=0;i<min;i++)
                {
                    ans.append(t.substring(count));
                    g++;
                }
                if(g>0)
                {
                    map1.put(1,(map1.get(1)-sone));
                    map1.put(0,(map1.get(0)-szero));
                }
            }
        }
        int f1=map1.get(1);
        int f2=map1.get(0);
        for(int i=0;i<f1;i++)
            ans=ans.append("1");
        for(int i=0;i<f2;i++)
            ans=ans.append("0");
        out.printLine(ans);
        out.flush();
    }
}