import java.io.*;
import java.util.*;
public class StringCommonDivisors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int sum1[]=new int[s1.length()];
        int sum2[]=new int[s2.length()];
        HashMap<String,Integer> map=new HashMap();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(i==0)
                sum1[i]=(int)(s1.charAt(i));
            else
                sum1[i]=sum1[i-1]+s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++)
        {
            if(i==0)
                sum2[i]=(int)(s2.charAt(i));
            else
                sum2[i]=sum2[i-1]+s2.charAt(i);
        }
        for(int i=0;i<s1.length();i++)
        {
            if(sum1[s1.length()-1]%sum1[i]==0 && (s1.length()%(i+1)==0))
            {
                int val=map.getOrDefault(s1.substring(0,(i+1)),0);
                map.put(s1.substring(0,(i+1)),val+1);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(sum2[s2.length()-1]%sum2[i]==0 && (s2.length()%(i+1)==0))
            {
                int val=map.getOrDefault(s2.substring(0,(i+1)),0);
                map.put(s2.substring(0,(i+1)),val+1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==2)
                count++;
        }
        System.out.println(count);
    }
}