import java.io.*;
import java.util.*;
public class CF702B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int freq[]=new int[3];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                freq[(a[i]%3)]++;
            }
            int tar=n/3;
            int ans=0,g=0;
            for(int i=0;i<3;i++)
            {
                if(freq[i]>tar)
                    g++;
            }
            if(g==1)
            {
                if(freq[2]>tar)
                    ans=(tar-freq[0])+(2*(tar-freq[1]));
                else if(freq[1]>tar)
                    ans=(tar-freq[2])+(2*(tar-freq[0]));
                else
                    ans=(tar-freq[1])+(2*(tar-freq[2]));
            }
            else if(g==2)
            {
                if(freq[0]>tar && freq[1]>tar)
                    ans=(tar-freq[2])+(freq[0]-tar);
                else if(freq[0]>tar && freq[2]>tar)
                    ans=(tar-freq[1])+(freq[2]-tar);
                else
                    ans=(tar-freq[0])+(freq[1]-tar);
            }
            System.out.println(ans);
        }
    }
}