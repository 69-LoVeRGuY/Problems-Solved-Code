import java.io.*;
import java.util.*;
public class AdaKing
{
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
        Scanner sc=new Scanner(System.in);
        OutputWriter out=new OutputWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int k=sc.nextInt();
            int c=0;
            for(int i=0;i<k;i++)
            {
                if(i==0)
                    out.print("O");
                else
                    out.print(".");
                c++;
                if(c%8==0)
                    out.printLine();
            }
            while(c<64)
            {
                out.print("X");
                c++;
                if(c%8==0)
                    out.printLine();
            }
            out.flush();
        }
    }
}