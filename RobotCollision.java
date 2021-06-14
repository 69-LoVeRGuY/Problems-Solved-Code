import java.io.*;
import java.util.*;
public class RobotCollision
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
            int m=sc.nextInt();
            int a[]=new int[n];
            char ch[]=new char[n];
            int ans[]=new int[n];
            List<Integer> odd=new ArrayList();
            List<Integer> even=new ArrayList();
            HashMap<Integer,Integer> map=new HashMap();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                map.put(a[i],i);
                if(a[i]%2==0)
                    even.add(a[i]);
                else
                    odd.add(a[i]);
            }
            Collections.sort(even);
            Collections.sort(odd);
            for(int i=0;i<n;i++)
                ch[i]=sc.next().charAt(0);
            Stack<Integer> r1=new Stack();
            int f=0;
            for(int i=0;i<odd.size();i++)
            {
                if(ch[map.get(odd.get(i))]=='R')
                    r1.push(odd.get(i));
                else
                {
                    if(r1.isEmpty())
                    {
                        r1.push(odd.get(i));
                        f++;
                        continue;
                    }
                    if(r1.size()==1 && f>0)
                    {
                        int x=r1.pop();
                        int cal=(odd.get(i)+x)/2;
                        ans[map.get(x)]=cal;
                        ans[map.get(odd.get(i))]=cal;
                        f=0;
                        continue;
                    }
                    int x=r1.pop();
                    int cal=(odd.get(i)-x)/2;
                    ans[map.get(x)]=cal;
                    ans[map.get(odd.get(i))]=cal;
                }
            }
            if(!r1.isEmpty())
            {
                while(r1.size()>1)
                {
                    int x1=r1.pop();
                    int x2=r1.pop();
                    int cal=0;
                    if(f>0 && r1.size()==0)
                        cal=((m-x1)+(m+x2))/2;
                    else
                        cal=((m-x1)+(m-x2))/2;
                    ans[map.get(x1)]=cal;
                    ans[map.get(x2)]=cal;
                }
                if(!r1.isEmpty())
                    ans[map.get(r1.pop())]=-1;
            }
            Stack<Integer> r2=new Stack();
            int z=0;
            for(int i=0;i<even.size();i++)
            {
                if(ch[map.get(even.get(i))]=='R')
                    r2.push(even.get(i));
                else
                {
                    if(r2.isEmpty())
                    {
                        r2.push(even.get(i));
                        z++;
                        continue;
                    }
                    if(r2.size()==1 && z>0)
                    {
                        int x=r2.pop();
                        int cal=(even.get(i)+x)/2;
                        ans[map.get(x)]=cal;
                        ans[map.get(even.get(i))]=cal;
                        z=0;
                        continue;
                    }
                    int x=r2.pop();
                    int cal=(even.get(i)-x)/2;
                    ans[map.get(x)]=cal;
                    ans[map.get(even.get(i))]=cal;
                }
            }
            if(!r2.isEmpty())
            {
                while(r2.size()>1)
                {
                    int x1=r2.pop();
                    int x2=r2.pop();
                    int cal=0;
                    if(z>0 && r2.size()==0)
                        cal=((m-x1)+(m+x2))/2;
                    else
                        cal=((m-x1)+(m-x2))/2;
                    ans[map.get(x1)]=cal;
                    ans[map.get(x2)]=cal;
                }
                if(!r2.isEmpty())
                    ans[map.get(r2.pop())]=-1;
            }
            for(int i=0;i<n;i++)
                out.print(ans[i]+" ");
            out.printLine();
            out.flush();
        }
    }
}