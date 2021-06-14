import java.io.*;
import java.util.*;
public class SubstringRemovalGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            List<Integer> list=new ArrayList();
            int i=0;
            while(i<s.length())
            {
                if(s.charAt(i)=='1' && i!=s.length()-1)
                {
                    int j=i+1,count=1;
                    while(s.charAt(j)=='1')
                    {
                        count++;
                        j++;
                        if(j>s.length()-1)
                            break;
                    }
                    list.add(count);
                    i=j;
                }
                else
                    i++;
            }
            if(s.length()>=2)
            {
                if(s.charAt(s.length()-2)=='0' && s.charAt(s.length()-1)=='1')
                    list.add(1);
            }
            else
            {
                if(s.charAt(0)=='1')
                    list.add(1);
            }
            Collections.sort(list,Collections.reverseOrder());
            if(list.size()==0)
                System.out.println(0);
            else if(list.get(0)==1)
            {
                if(list.size()%2==0)
                    System.out.println((list.size()/2));
                else
                    System.out.println(((list.size()/2)+1));
            }
            else
            {
                int j=0,ans=0;
                while(j<list.size())
                {
                   ans=ans+list.get(j);
                   j+=2;
                }
                System.out.println(ans);
            }
        }
    }
}
 