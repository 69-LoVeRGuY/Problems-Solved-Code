import java.io.*;
import java.util.*;
public class MakeThemOdd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            List<Integer> l=new ArrayList();
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                l.add(b);
            }
            int c=0;
            Collections.sort(l,Collections.reverseOrder());
            HashSet<Integer> h=new HashSet(l);
            Iterator<Integer> i=h.iterator();
            while(i.hasNext())
            {
                int v=i.next();
                if(v%2==0)
                {
                    while(v%2==0)
                    {
                        v=v/2;
                        c++;
                        if(h.contains(v))
                            break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}