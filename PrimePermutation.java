import java.io.*;
import java.util.*;
public class PrimePermutation
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
    static boolean prime[];
    static void sieve(int n)
    {
        prime=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=false;
            }
        }
    }
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        OutputWriter out=new OutputWriter(System.out);
        int max=Integer.MIN_VALUE;
        int a[]=new int[123];
        String s=sc.next();
        if(s.length()<=3)
        {
            out.printLine("YES");
            out.printLine(s);
            out.flush();
            System.exit(0);
        }
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]++;
            if(a[s.charAt(i)]>max)
                max=a[s.charAt(i)];
        }
        sieve(s.length());
        int arr[]=new int[s.length()+1];
        int c=1,count=0;
        for(int i=2;i<=s.length();i++)
        {
            if(prime[i]==false)
                continue;
            if(arr[i]!=0)
            {
                for(int j=2*i;j<=s.length();j+=i)
                {
                    if(arr[j]==0)
                    {
                        arr[j]=arr[i];
                        count++;
                    }
                }
            }
            else
            {
                if(i==2)
                {
                    count++;
                    arr[i]=c;
                    for(int j=2*i;j<=s.length();j+=i)
                    {
                        if(arr[j]==0)
                        {
                            arr[j]=arr[i];
                            count++;
                            if(prime[j/2] && j/2!=i)
                            {
                                arr[j/2]=arr[i];
                                count++;
                            }
                        }
                    }
                }
                else
                {
                    c++;
                    arr[i]=c;
                }
            }
        }
        if(count>max)
            out.printLine("NO");
        else
        {
            out.printLine("YES");
            char ans[]=new char[s.length()+1];
            Arrays.fill(ans,' ');
            int index=0;
            for(int i=97;i<=122;i++)
            {
                if(a[i]==max)
                {
                    index=i;
                    break;
                }
            }
            for(int i=2;i<=s.length();i++)
            {
                if(arr[i]==1)
                {
                    ans[i]=(char)index;
                    a[index]--;
                }
            }
            for(int i=1;i<s.length()+1;i++)
            {
                if(ans[i]==' ')
                {
                    for(int j=97;j<=122;j++)
                    {
                        if(a[j]>0)
                        {
                            ans[i]=(char)j;
                            a[j]--;
                            break;
                        }
                    }
                }
            }
            String res=String.valueOf(ans);
            out.printLine(res.substring(1));
        }
        out.flush();
    }
}