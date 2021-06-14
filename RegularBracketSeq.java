import java.io.*;
import java.util.*;
public class RegularBracketSeq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            Stack<Character> stack=new Stack();
            List<Character> list=new ArrayList();
            List<Integer> ques=new ArrayList();
            int q=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='(')
                    list.add(ch);
                else if(ch==')')
                    list.add(ch);
                else
                {
                    q++;
                    ques.add(i);
                    list.add(' ');
                }
            }
            int f=0;
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i)=='(')
                    stack.push(list.get(i));
                else if(list.get(i)==')')
                {
                    if(stack.size()>0)
                        stack.pop();
                    else
                    {
                        if(ques.size()>0)
                        {
                            if(ques.get(0)<i)
                            {
                                ques.remove(0);
                                q--;
                            }
                            else
                            {
                                f=-1;
                                break;
                            }
                        }
                        else
                        {
                            f=-1;
                            break;
                        }
                    }
                }
            }
            if(f==0 && stack.size()==0 && (q%2==0))
                System.out.println("YES");
            else if(f==0 && stack.size()!=0 && (q==stack.size() || (q>stack.size() && ((q-stack.size())%2==0))))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}