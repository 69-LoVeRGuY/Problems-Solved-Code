import java.io.*;
import java.util.*;
public class Winner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        int score=Integer.MIN_VALUE;
        int sum[]=new int[n];
        String x[]=new String[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.next();
            sum[i]=sc.nextInt();
            if(map.containsKey(x[i]))
            {
                sum[i]=sum[i]+map.get(x[i]);
                map.put(x[i],sum[i]);
            }
            else
                map.put(x[i],sum[i]);
        }
        score=Collections.max(map.values());
        for(int i=0;i<n;i++)
        {
            if(map.get(x[i])==score && sum[i]>=score)
            {
                System.out.println(x[i]);
                break;
            }
        }
    }
}