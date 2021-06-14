import java.io.*;
import java.util.*;
public class CF720A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long x=0,y=0,z=0;
            y=(2*b-1)*a;
            z=a*b*2;
            x=a;
            HashSet<Long> set=new HashSet();
            set.add(x);
            set.add(y);
            set.add(z);
            if(set.size()==3 && (x+y==z))
            {
                System.out.println("YES");
                System.out.println(x+" "+y+" "+z);
            }
            else
                System.out.println("NO");
        }
    }
}