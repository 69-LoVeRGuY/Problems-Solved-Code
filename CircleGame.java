import java.io.*;
import java.util.*;
public class CircleGame
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int d=sc.nextInt();
            int k=sc.nextInt();
            int x=0,y=0,turn=0;
            while((int)Math.pow(x,2)+(int)Math.pow(y,2)<=(int)Math.pow(d,2))
            {
                if((int)Math.pow((x+k),2)+(int)Math.pow(y,2)<=(int)Math.pow(d,2) && (int)Math.pow(x,2)+(int)Math.pow((y+k),2)<=(int)Math.pow(d,2))
                {
                    if(x<=y)
                        x+=k;
                    else
                        y+=k;
                    turn++;
                }
                else if((int)Math.pow((x+k),2)+(int)Math.pow(y,2)>(int)Math.pow(d,2) && (int)Math.pow(x,2)+(int)Math.pow((y+k),2)<=(int)Math.pow(d,2))
                {
                    y+=k;
                    turn++;
                }
                else if((int)Math.pow((x+k),2)+(int)Math.pow(y,2)<=(int)Math.pow(d,2) && (int)Math.pow(x,2)+(int)Math.pow((y+k),2)>(int)Math.pow(d,2))
                {
                    x+=k;
                    turn++;
                }
                else
                    x+=k;
            }
            if(turn%2==0)
                out.printLine("Utkarsh");
            else
                out.printLine("Ashish");
            out.flush();
        }
    }
}