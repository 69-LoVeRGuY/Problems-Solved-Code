import java.io.*;
import java.util.*;
public class BoatCompetition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap();
            HashSet<Integer> set=new Hashset();
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                set.add(b);
                if(map.containsKey(b))
                    map.put(b,map.get(b)+1);
                else
                    map.put(b,1);
            }
            if(set.size()==n)
            {
                System.out.println(