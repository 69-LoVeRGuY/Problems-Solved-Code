import java.io.*;
import java.util.*;
public class ExtendingStackInterface
{
    static int maxElement=0;
    static class MyStack
    {
        Stack<Integer> s=new Stack();
        void max()
        {
            if(s.empty())
                System.out.println();
            else
                System.out.println(maxElement);
        }
        void popout()
        {
            if(s.empty()==false)
            {
                int t=s.peek();
                s.pop();
                if(t>=maxElement)
                    maxElement=(2*maxElement)-t;
            }
        }
        void pushin(int n)
        {
            if(s.empty())
            {
                s.push(n);
                maxElement=n;
                return;
            }
            if(n>maxElement)
            {
                int r=(2*n)-maxElement;
                maxElement=n;
                s.push(r);
            }
            else
                s.push(n);
        }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int q=sc.nextInt();
       MyStack z=new MyStack();
       for(int i=0;i<=q;i++)
       {
           String s=sc.nextLine();
           if(s.length()>3)
           {
               int n=Integer.parseInt(s.substring(5));
               z.pushin(n);
           }
           else if(s.equals("max"))
               z.max();
           else
               z.popout();
       }
    }
}
 