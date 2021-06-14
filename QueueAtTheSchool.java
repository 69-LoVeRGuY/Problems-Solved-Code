import java.io.*;
import java.util.*;
public class QueueAtTheSchool
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=1;i<=t;i++)
        {
            int c=0,j=0;
            while(j<s.length()-1)
            {
                if(ch[j]=='B' && ch[j+1]=='G')
                {
                    ch[j]='G';
                    ch[j+1]='B';
                    c++;
                    j=j+2;
                }
                else 
                    j++;
            }
            if(c==0)
                break;
        }
        for(int i=0;i<ch.length;i++)
            System.out.print(ch[i]);
        System.out.println();
    }
}