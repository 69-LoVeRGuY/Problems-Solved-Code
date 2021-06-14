import java.io.*;
import java.util.*;
public class LittleElephant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE,pos=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a<min)
            {
                min=a;
                pos=i+1;
            }
            if(map.containsKey(a))
                map.put(a,map.get(a)+1);
            else
                map.put(a,1);
        }
        if(map.get(min)>1)
            System.out.println("Still Rozdil");
        else
            System.out.println(pos);
    }
}