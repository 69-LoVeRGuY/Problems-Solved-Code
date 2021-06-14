import java.io.*;
import java.util.*;
public class AdaAndDishes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            List<Integer> list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                int c=sc.nextInt();
                list.add(c);
            }
            int ans=0,c=0,f=0;
            Collections.sort(list);
            while(list.size()>0)
            {
                if(list.size()==1)
                {
                    ans=ans+list.get(0);
                    break;
                }
                if(list.get(list.size()-1)==list.get(list.size()-2))
                {
                    ans=ans+list.get(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                }
                else
                {
                    ans=ans+Math.min(list.get(list.size()-1),list.get(list.size()-2));
                    int z=Math.max(list.get(list.size()-1),list.get(list.size()-2))-Math.min(list.get(list.size()-1),list.get(list.size()-2));
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.add(z);
                }
            }
            System.out.println(ans);
        }
    }
}