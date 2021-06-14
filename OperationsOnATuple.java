import java.io.*;
import java.util.*;
public class OperationsOnATuple
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
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
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0)
        {
            List<Integer> initial=new ArrayList();
            List<Integer> last=new ArrayList();
            initial.add(sc.nextInt());
            initial.add(sc.nextInt());
            initial.add(sc.nextInt());
            last.add(sc.nextInt());
            last.add(sc.nextInt());
            last.add(sc.nextInt());
            int d1=last.get(0)-initial.get(0);
            int d2=last.get(1)-initial.get(1);
            int d3=last.get(2)-initial.get(2);
            HashSet<Integer> hs=new HashSet();
            hs.add(d1);
            hs.add(d2);
            hs.add(d3);
            List<Integer> diff=new ArrayList();
            diff.add(d1);
            diff.add(d2);
            diff.add(d3);
            int b[]=new int[3];
            int q[]=new int[2];
            int r[]=new int[2];
            int min=Integer.MAX_VALUE;
            int pos=0,c=0;
            for(int i=0;i<3;i++)
            {
                if(diff.get(i)<min)
                {
                    min=diff.get(i);
                    pos=i;
                }
            }
            int z=initial.get(pos);
            initial.remove(pos);
            initial.add(0,z);
            int y=last.get(pos);
            last.remove(pos);
            last.add(0,y);
            diff.remove(pos);
            for(int i=1;i<3;i++)
            {
                if(last.get(i)!=0 && initial.get(i)!=0)
                {
                    q[c]=last.get(i)/initial.get(i);
                    r[c]=last.get(i)%initial.get(i);
                    c++;
                }
                else
                {
                    q[c]=Math.max(last.get(i),initial.get(i))-Math.min(last.get(i),initial.get(i));
                    r[c]=0;
                    c++;
                }
            }
            if(hs.size()==1 && hs.contains(0))
                System.out.println(0);
            else if(hs.size()==1 && hs.contains(0)==false)
                System.out.println(1);
            else if(hs.size()==2 && hs.contains(0))
                System.out.println(1);
            else if(hs.size()==2)
                System.out.println(2);
            else if(q[0]==q[1] && r[0]==min && r[1]==min)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}