import java.io.*;
import java.util.*;
public class SpitProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap();
        int x[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            d[i]=sc.nextInt();
            map.put(x[i],d[i]);
        }
        int f=-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int r=entry.getKey()+entry.getValue();
            if(map.containsKey(r))
            {
                if(r+map.get(r)==entry.getKey())
                {
                    f=0;
                    break;
                }
            }
        }
        if(f==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}