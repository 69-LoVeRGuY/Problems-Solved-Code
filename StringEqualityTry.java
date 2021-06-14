import java.io.*;
import java.util.*;
public class StringEqualityTry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int a1[]=new int[26];
            for(int i=0;i<n;i++)
            {
                char ch1=a.charAt(i);
                char ch2=b.charAt(i);
                a1[ch1-'a']++;
                a1[ch2-'a']--;
            }
            int f=0,left=0;
            for(int i=0;i<26;i++)
            {
                if(a1[i]>0)
                {
                    if(a1[i]%k!=0)
                    {
                        f=-1;
                        break;
                    }
                    left+=a1[i];
                }
                else if(a1[i]<0)
                {
                    int r=-a1[i];
                    if(r%k!=0 || r>left)
                    {
                        f=-1;
                        break;
                    }
                    left+=a1[i];
                }
            }
            if(f==-1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}