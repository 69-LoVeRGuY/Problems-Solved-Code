import java.io.*;
import java.util.*;
public class PalpalString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            HashMap<Character,Integer> map=new HashMap();
            for(int i=0;i<s.length();i++)
            {
                if(map.containsKey(s.charAt(i)))
                {
                    int val=map.get(s.charAt(i));
                    map.put(s.charAt(i),val+1);
                }
                else
                    map.put(s.charAt(i),1);
            }
            int one=0,even=0,odd=0;
            for(Map.Entry<Character,Integer> entry : map.entrySet())
            {
                if(entry.getValue()==1)
                    one++;
                else
                {
                    if(entry.getValue()%2==0)
                    {
                        int d=entry.getValue()/2;
                        even+=d;
                    }
                    else
                    {
                        int d=entry.getValue()/2;
                        d--;
                        odd+=d;
                    }
                }
            }
            if(odd+even>=one)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}