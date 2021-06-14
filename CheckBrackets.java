import java.io.*;
import java.util.*;
public class CheckBrackets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> stack=new Stack();
        int f=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                if(stack.empty())
                    ans=i+1;
                stack.push(ch);
            }
            else if(ch==')')
            {
                char check=stack.peek();
                if(check=='(')
                    stack.pop();
                else
                {
                    f=-1;
                    ans=i+1;
                    break;
                }
            }
            else if(ch=='}')
            {
                char check=stack.peek();
                if(check=='{')
                    stack.pop();
                else
                {
                    f=-1;
                    ans=i+1;
                    break;
                }
            }
            else if(ch==']')
            {
                char check=stack.peek();
                if(check=='[')
                    stack.pop();
                else
                {
                    f=-1;
                    ans=i+1;
                    break;
                }
            }
        }
        if(stack.empty())
            System.out.println("Success");
        else
            System.out.println(ans);  
    }
}