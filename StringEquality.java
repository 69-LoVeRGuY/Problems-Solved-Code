import java.io.*;
import java.util.*;
public class StringEquality
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int f=0,mina=Integer.MAX_VALUE,minb=Integer.MAX_VALUE,left=0;
            TreeMap<Character,Integer> map1=new TreeMap();
            TreeMap<Character,Integer> map2=new TreeMap();
            for(int i=0;i<n;i++)
            {
                char ch=a.charAt(i);
                if(ch<mina)
                    mina=ch;
                int val=map1.getOrDefault(ch,0);
                map1.put(ch,val+1);
            }
            for(int i=0;i<n;i++)
            {
                char ch=b.charAt(i);
                if(ch<minb)
                    minb=ch;
                int val=map2.getOrDefault(ch,0);
                map2.put(ch,val+1);
            }
            for(Map.Entry<Character,Integer> entry : map1.entrySet())
            {
                char key=entry.getKey();
                int value=entry.getValue();
                if(map2.containsKey(key))
                {
                    int check=map2.get(key);
                    if(check>(value+left))
                    {
                        f=-1;
                        break;
                    }
                    else
                    {
                        left=left+value-check;
                        if(left%k!=0)
                        {
                            f=-1;
                            break;
                        }
                    }
                }
                else
                {
                    if(value%k!=0 || key=='z')
                    {
                        f=-1;
                        break;
                    }
                    else
                        left=left+value;
                }
            }
            for(Map.Entry<Character,Integer> entry : map2.entrySet())
            {
                char key=entry.getKey();
                int value=entry.getValue();
                if(map1.containsKey(key)==false)
                {
                    if(value%k!=0)
                    {
                        f=-1;
                        break;
                    }
                }
            }
            if(map1.size()==0 || minb<mina)
                f=-1;
            if(f==-1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}