import java.io.*;
import java.util.*;
public class ModularEquation
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
    static int upperBound(List<Integer> list,int key)
    {
        int low = 0;
        int high = list.size();
        while(low != high){
            int mid = low + high>>1;
            if(list.get(mid) <= key){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        if(low==list.size())
            return -1;
        return low;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            long ans=(long)(n-1);
            HashMap<Integer,List<Integer>> map=new HashMap();
            for(int i=2;i<=n;i++)
            {
                int rem=m%i;
                if(map.containsKey(rem))
                {
                    List<Integer> list=map.get(rem);
                    list.add(i);
                }
                else
                {
                    List<Integer> list=new ArrayList();
                    list.add(i);
                    map.put(rem,list);
                }
            }
            for(int i=2;i<n;i++)
            {
                int rem=m%i;
                for(int j=0;;j++)
                {
                    int num=(i*j)+rem;
                    if(num>n)
                        break;
                    else
                    {
                        if(map.containsKey(num))
                        {
                            int pos=upperBound(map.get(num),i);
                            if(pos==-1)
                                pos=map.get(num).size();
                            ans+=(map.get(num).size()-pos);
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}