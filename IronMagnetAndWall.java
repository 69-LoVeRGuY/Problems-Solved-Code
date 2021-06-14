import java.io.*;
import java.util.*;
public class IronMagnetAndWall
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int sheet[]=new int[n];
            List<Integer> iron=new ArrayList();
            List<Integer> magnet=new ArrayList();
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                if(ch=='I')
                    iron.add(i);
                else if(ch=='M')
                    magnet.add(i);
                else if(ch==':')
                {
                    if(i>0)
                        sheet[i]=sheet[i-1]+1;
                    else
                        sheet[i]=1;
                    continue;
                }
                if(i>0)
                    sheet[i]=sheet[i-1];
                else
                    sheet[i]=0;
            }
            Integer fe[]=new Integer[iron.size()];
            fe=iron.toArray(fe);
            Integer m[]=new Integer[magnet.size()];
            m=magnet.toArray(m);
            int x=0,y=0,ans=0;
            while(x<fe.length && y<m.length)
            {
                int d=Math.min(fe[x],m[y]);
                int e=Math.max(fe[x],m[y]);
                String r=s.substring(d,e+1);
                if(r.contains("X"))
                {
                    if(fe[x]>m[y])
                        y++;
                    else
                        x++;
                }
                else
                {
                    int z=sheet[e]-sheet[d];
                    int p=k+1-Math.abs(d-e)-z;
                    if(p>0)
                    {
                        ans++;
                        x++;
                        y++;
                    }
                    else
                    {
                        if(fe[x]>m[y])
                            y++;
                        else
                            x++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}