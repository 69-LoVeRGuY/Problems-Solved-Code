import java.io.*;
import java.util.*;
public class FairElections
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int john[]=new int[n];
            int jack[]=new int[m];
            int johnsum=0,jacksum=0,count=0;
            for(int i=0;i<n;i++)
            {
                john[i]=sc.nextInt();
                johnsum+=john[i];
            }
            for(int i=0;i<m;i++)
            {
                jack[i]=sc.nextInt();
                jacksum+=jack[i];
            }
            if(johnsum>jacksum)
            {
                System.out.println(0);
                continue;
            }
            Arrays.sort(jack);
            Arrays.sort(john);
            int c=0,d=m-1;
            while(c<n && d>=0)
            {
                int diff=jack[d]-john[c];
                if(jack[d]==john[c])
                    break;
                johnsum+=diff;
                jacksum-=diff;
                count++;
                if(johnsum>jacksum)
                    break;
                else
                {
                    c++;
                    d--;
                }
            }
            if(johnsum>jacksum)
                System.out.println(count);
            else
                System.out.println("-1");
        }
    }
}