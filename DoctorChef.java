import java.io.*;
import java.util.*;
public class DoctorChef
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            List<Integer> small=new ArrayList();
            List<Integer> large=new ArrayList();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a>=x)
                    large.add(a);
                else
                    small.add(a);
            }
            Collections.sort(large);
            Collections.sort(small,Collections.reverseOrder());
            Integer big[]=new Integer[large.size()];
            big=large.toArray(big);
            Integer notbig[]=new Integer[small.size()];
            notbig=small.toArray(notbig);
            if(notbig.length>0)
            {
                if((notbig[0]*2)>=x)
                    x=2*notbig[0];
            }
            int days=0,i=0;
            while(i<big.length)
            {
                if(x>=big[i])
                {
                    x=Math.min(x,big[i]);
                    big[i]=big[i]-x;
                    big[i]*=2;
                }
                x*=2;
                days++;
                if(big[i]==0)
                    i++;
            }
            System.out.println(days+notbig.length);
        }
    }
}
   