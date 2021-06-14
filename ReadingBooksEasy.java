import java.io.*;
import java.util.*;
public class ReadingBooksEasy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int both[]=new int[10001];
        int alice[]=new int[10001];
        int bob[]=new int[10001];
        int total=0,acount=0,bcount=0;
        for(int i=0;i<n;i++)
        {
            int t=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==1 && b==1)
                both[t]++;
            else if(a==1 && b==0)
                alice[t]++;
            else if(a==0 && b==1)
                bob[t]++;
        }
        for(int i=1;i<10001;i++)
        {
            if(both[i]>0)
            {
                while(both[i]>0 && (acount<k || bcount<k))
                {
                    acount++;
                    bcount++;
                    total=total+i;
                    both[i]--;
                }
            }
            if(alice[i]>0 && acount<k)
            {
                while(alice[i]>0 && acount<k)
                {
                    acount++;
                    total=total+i;
                    alice[i]--;
                }
            }
            if(bob[i]>0 && bcount<k)
            {
                while(bob[i]>0 && bcount<k)
                {
                    bcount++;
                    total=total+i;
                    bob[i]--;
                }
            }
            if(acount>=k && bcount>=k)
                break;
        }
        if(acount>=k && bcount>=k)
            System.out.println(total);
        else
            System.out.println(-1);
    }
}