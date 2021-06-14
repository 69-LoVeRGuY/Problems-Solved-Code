import java.io.*;
import java.util.*;
public class RegistrationSystem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            if(map.containsKey(s)==false)
            {
                System.out.println("OK");
                map.put(s,1);
            }
            else
            {
                String r=s+String.valueOf(map.get(s));
                System.out.println(r);
                map.put(s,map.get(s)+1);
            }
        }
    }
}