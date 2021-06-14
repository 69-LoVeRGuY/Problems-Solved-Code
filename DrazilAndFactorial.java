import java.io.*;
import java.util.*;
public class DrazilAndFactorial
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
        int n=sc.nextInt();
        String s=sc.next();
        List<Integer> al=new ArrayList();
        for(int i=0;i<n;i++)
        {
            int d=Integer.parseInt(s.substring(i,i+1));
            if(d==1 || d==0)
                continue;
            else if(d==2 || d==3 || d==5 || d==7)
                al.add(d);
            else if(d==4)
            {
                al.add(2);
                al.add(2);
                al.add(3);
            }
            else if(d==6)
            {
                al.add(3);
                al.add(5);
            }
            else if(d==8)
            {
                al.add(7);
                al.add(2);
                al.add(2);
                al.add(2);
            }
            else if(d==9)
            {
                al.add(7);
                al.add(3);
                al.add(3);
                al.add(2);
            }
        }
        Collections.sort(al,Collections.reverseOrder());
        for(int i=0;i<al.size();i++)
            out.print(al.get(i));
        out.printLine();
        out.flush();
    }
}