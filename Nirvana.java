import java.io.*;
import java.util.*;
public class Nirvana
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=Integer.parseInt(s);
        char ch[]=s.toCharArray();
        if(n<10)
        {
            System.out.println(n);
            System.exit(0);
        }
        long pro=1L;
        int z=n;
        while(z>0)
        {
            int d=z%10;
            pro=pro*d;
            z=z/10;
        }
        int d=(int)(Math.log10(n))+1;
        for(int i=d-1;i>0;i--)
        {
            long p=1L;
            if(ch[i]!='9')
            {
                ch[i]='9';
                if(ch[i-1]=='0')
                {
                    int j=i-1;
                    do
                    {
                        ch[j]='9';
                        j--;
                    }while(ch[j]=='0');
                    ch[j]=(char)(ch[j]-1);
                }
                else
                    ch[i-1]=(char)(ch[i-1]-1);
                String r=String.valueOf(ch);
                int y=Integer.parseInt(r);
                while(y>0)
                {
                    int l=y%10;
                    p=p*l;
                    y=y/10;
                }
                if(p>pro)
                    pro=p;
            }
        }
        System.out.println(pro);
    }
}