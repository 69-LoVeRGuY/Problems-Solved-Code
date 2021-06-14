import java.io.*;
import java.util.*;
public class CF723B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]={11,111,1111,11111,111111,1111111,11111111,111111111};
        while(t-->0)
        {
            int n=sc.nextInt();
            String z=String.valueOf(n);
            int x=0,f=0;
            while(a[x]<=n)
            {
                if(n%a[x]==0)
                {
                    f++;
                    break;
                }
                x++;
                if(x==8)
                    break;
            }
            if(f>0)
            {
                System.out.println("YES");
                continue;
            }
            while(n>=11)
            {
                int digit=(int)Math.log10(n)+1;
                n-=a[digit-2];
                int s=0,m=0;
                while(a[s]<=n)
                {
                    if(n%a[s]==0)
                    {
                        m++;
                        System.out.println("YES");
                        f++;
                        break;
                    }
                    s++;
                    if(s==8)
                        break;
                }
                if(m>0)
                    break;
            }
            if(f>0)
                continue;
            while(z.charAt(z.length()-1)=='0')
            {
                z=z.substring(0,z.length()-1);
                int y=Integer.parseInt(z);
                while(y>=11)
                {
                    int digit=(int)Math.log10(y)+1;
                    y-=a[digit-2];
                    int s=0,m=0;
                    while(a[s]<=y)
                    {
                        if(y%a[s]==0)
                        {
                            m++;
                            System.out.println("YES");
                            f++;
                            break;
                        }
                        s++;
                        if(s==8)
                            break;
                    }
                    if(m>0)
                        break;
                }
                if(f>0)
                    break;
            }
            if(f==0)    
                System.out.println("NO");
        }
    }
}