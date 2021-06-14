import java.io.*;
import java.util.*;
public class TicTacToe
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
            char s[][]=new char[3][3];
            int fw=0,sw=0,emp=0,f=0,se=0;
            for(int i=0;i<3;i++)
            {
                String x=sc.next();
                for(int j=0;j<3;j++)
                {
                    s[i][j]=x.charAt(j);
                    if(s[i][j]=='X')
                        f++;
                    else if(s[i][j]=='O')
                        se++;
                    else
                        emp++;
                }
            }
            if(se>f)
            {
                out.printLine("3");
                out.flush();
                continue;
            }
            if(s[0][0]=='X' && s[0][1]=='X' && s[0][2]=='X')
                fw++;
            if(s[0][0]=='X' && s[1][0]=='X' && s[2][0]=='X')
                fw++;
            if(s[0][0]=='X' && s[1][1]=='X' && s[2][2]=='X')
                fw++;
            if(s[1][0]=='X' && s[1][1]=='X' && s[1][2]=='X')
                fw++;
            if(s[2][0]=='X' && s[2][1]=='X' && s[2][2]=='X')
                fw++;
            if(s[0][2]=='X' && s[1][2]=='X' && s[2][2]=='X')
                fw++;
            if(s[0][2]=='X' && s[1][1]=='X' && s[2][0]=='X')
                fw++;
            if(s[0][1]=='X' && s[1][1]=='X' && s[2][1]=='X')
                fw++;
            if(s[0][1]=='O' && s[1][1]=='O' && s[2][1]=='O')
                sw++;
            if(s[0][0]=='O' && s[0][1]=='O' && s[0][2]=='O')
                sw++;
            if(s[0][0]=='O' && s[1][0]=='O' && s[2][0]=='O')
                sw++;
            if(s[0][0]=='O' && s[1][1]=='O' && s[2][2]=='O')
                sw++;
            if(s[1][0]=='O' && s[1][1]=='O' && s[1][2]=='O')
                sw++;
            if(s[2][0]=='O' && s[2][1]=='O' && s[2][2]=='O')
                sw++;
            if(s[0][2]=='O' && s[1][2]=='O' && s[2][2]=='O')
                sw++;
            if(s[0][2]=='O' && s[1][1]=='O' && s[2][0]=='O')
                sw++;
            if((fw==1 && sw==0 && emp==0 && f==5 && se==4) || (fw==1 && sw==0 && emp>0) || (fw==0 && sw==1 && emp==0 && f==5 && se==4) || (fw==0 && sw==1 && emp>0) || (fw==0 && sw==0 && emp==0 && f==5 && se==4))
                out.printLine("1");
            else if(fw==0 && sw==0 && emp>0)
                out.printLine("2");
            else 
                out.printLine("3");
            out.flush();
        }
    }
}
    