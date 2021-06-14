import java.io.*;
import java.util.*;
public class MoveBrackets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            String s=sc.next();
            Stack b=new Stack();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='(')
                {
                    b.push(s.charAt(i));
                    c++;
                }
                else if(s.charAt(i)==')' && b.empty()==false)
                {
                    b.pop();
                    c--;
                }
            }
            System.out.println(c);
        }
    }
}