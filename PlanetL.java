import java.io.*;
import java.util.*;
public class PlanetL
{
    static int LowerBound(int a[], int x) 
    { 
        int l=-1,r=a.length;
        while(l+1<r) 
        {
            int m=(l+r)>>>1;
            if(a[m]>=x) 
                r=m;
            else 
                l=m;
        }
        if(r<a.length)
            return r;
        else
            return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]={0,1,5,-1,-1,2,-1,-1,8,-1};
        int hh[]={0,1,2,5,8,10,11,12,15,18,20,21,22,25,28,50,51,52,55,58,80,81,82,85,88};
        while(t-->0)
        {
            int h=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            int gh=0,gm=0,fh=0,fm=0;
            for(int i=0;i<s.length();i++)
            {
                int d=0;
                if(i!=2)
                    d=Integer.parseInt(String.valueOf(s.charAt(i)));
                else
                    continue;
                if(i<2)
                    gh=gh*10+d;
                else if(i>2)
                    gm=gm*10+d;
            }
            int rh=LowerBound(hh,gh);
            int rm=LowerBound(hh,gm);
            int nh=hh[rh];
            int nm=hh[rm];
            if(nh>h)
                nh=0;
            if(nm>m)
                nm=0;
            String hour=String.valueOf(nh);
            String min=String.valueOf(nm);
            if(nh<10)
                hour="0"+hour;
            if(nm<10)   
                min="0"+min;
            String ans=hour+":"+min;
            System.out.println(ans);
        }
    }
}