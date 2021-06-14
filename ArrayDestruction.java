import java.io.*;
import java.util.*;
public class ArrayDestruction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            List<Integer> list=new ArrayList();
            int freq[]=new int[1000001];
            for(int i=0;i<(2*n);i++)
            {
                int a=sc.nextInt();
                freq[a]++;
                list.add(a);
            }
            int ans[][]=new int[n][2];
            int f=0,c=1;
            Collections.sort(list);
            ans[0][0]=list.get((2*n)-1);
            int cur=list.get(list.size()-1);
            list.remove(list.size()-1);
            freq[cur]--;
            while(list.size()>1)
            {
                int num=list.get(list.size()-1);
                freq[num]-=1;
                int diff=cur-num;
                if(list.contains(diff)==false || freq[diff]==0)
                {
                    f=-1;
                    break;
                }
                else
                {
                    ans[c][0]=num;
                    ans[c][1]=diff;
                    c++;
                    freq[diff]-=1;
                    list.remove(new Integer(num));
                    list.remove(new Integer(diff));
                    cur=num;
                }
            }
            if(f==-1)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                ans[0][1]=list.get(0);
                System.out.println((ans[0][0]+ans[0][1]));
                for(int i=0;i<n;i++)
                    System.out.println(ans[i][0]+" "+ans[i][1]);
            }
        }
    }
}