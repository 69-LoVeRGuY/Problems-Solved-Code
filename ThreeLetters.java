import java.io.*;
import java.util.*;
public class ThreeLetters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next().toLowerCase();
            int a[]=new int[26];
            int ans=0,total=0;
            for(int i=0;i<s.length();i++)
            {
                a[s.charAt(i)-'a']++;
                total++;
            }
            Arrays.sort(a);
            int i=25;
            while(total>=3 && i>=0)
            {
                if(a[i]>1)
                {
                    total-=3;
                    a[i]-=2;
                    ans++;
                }
                else
                    i--;
            }
            System.out.println(ans);
        }
    }
}
  