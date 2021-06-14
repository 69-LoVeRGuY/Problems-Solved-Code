import java.io.*;
import java.util.*;
public class PhoenixAndSocks
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
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=0,lu=0,ru=0;
            List<Integer> left=new ArrayList();
            List<Integer> right=new ArrayList();
            for(int i=0;i<l;i++)
                left.add(sc.nextInt());
            for(int i=0;i<r;i++)
                right.add(sc.nextInt());
            Collections.sort(left);
            Collections.sort(right);
            if(left.size()<=right.size())
            {
                for(int i=0;i<l;i++)
                {
                    if(right.contains(left.get(i)))
                    {
                        right.set(right.indexOf(left.get(i)),-1);
                        left.set(i,-1);
                        lu++;
                        ru++;
                    }
                }
            }
            else
            {
                for(int i=0;i<r;i++)
                {
                    if(left.contains(right.get(i)))
                    {
                        left.set(left.indexOf(right.get(i)),-1);
                        right.set(i,-1);
                        lu++;
                        ru++;
                    }
                }
            }
            int min=Math.min((l-lu),(r-ru));
            ans+=min;
            l=l-lu-min;
            r=r-ru-min;
            if(l>0)
            {
                Collections.sort(left,Collections.reverseOrder());
                int ii=0,ll=0;
                while(ii<l-1)
                {
                    if(left.get(ii)==-1)
                        break;
                    if(left.get(ii)==left.get(ii+1))
                    {
                        ans++;
                        ll+=2;
                        ii+=2;
                    }
                    else
                        ii++;
                }
                l-=ll;
            }
            if(r>0)
            {
                Collections.sort(right,Collections.reverseOrder());
                int ii=0,rr=0;
                while(ii<r-1)
                {
                    if(right.get(ii)==-1)
                        break;
                    if(right.get(ii)==right.get(ii+1))
                    {
                        ans++;
                        rr+=2;
                        ii+=2;
                    }
                    else
                        ii++;
                }
                r-=rr;
            }
            if(l>0)
                ans+=l;
            if(r>0)
                ans+=r;
            out.printLine(ans);
            out.flush();
        }
    }
}