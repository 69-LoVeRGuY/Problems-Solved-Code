import java.io.*;
import java.util.*;
public class PartialReplacement
{
    public static void main(String args[])
    {
        FastReader sc=new FastReader();
        Output out=new Output(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int ans=0;
            List<Integer> list=new ArrayList();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='*')
                    list.add(i);
            }
            Collections.sort(list);
            char ch[]=s.toCharArray();
            ch[list.get(0)]='x';
            ch[list.get(list.size()-1)]='x';
            s=ch.toString();
            list.remove(0);
            list.remove(list.size()-1);
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)