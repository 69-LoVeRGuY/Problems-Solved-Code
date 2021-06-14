import java.io.*;
import java.util.*;
public class VitalityAndPie
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                int val=map.getOrDefault(s.charAt(i),0);
                map.put(s.charAt(i),val+1);
            }
            else
            {
                if(map.containsKey((char)(s.charAt(i)+32)))
                {
                    if(map.get((char)(s.charAt(i)+32))>0)
                        map.put((char)(s.charAt(i)+32),map.get((char)(s.charAt(i)+32))-1);
                    else
                        count++;
                }
                else
                    count++;
            }
        }
        System.out.println(count);
    }
}