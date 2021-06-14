import java.io.*;
import java.util.*;
public class TripleSort
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int k=sc.nextInt();
           List<Integer> p=new ArrayList<>();
           for(int i=0;i<n;i++)
           {
               int a=sc.nextInt();
               p.add(a);
           }
           List<Integer> l=new ArrayList(p);
           Collections.sort(l);
           int count=0,g=0,h=0;
           String s[]=new String[k];
           int show[][]=new int[k][3];
           for(int i=0;i<l.size();i++)
           {
               int b=l.get(i);
               int c=p.get(i);
               if(c==b)
               {
                   count++;
                   
               }
               else
               {
                   
                   int z=p.indexOf(b);
                   int v1=p.get(i);
                   int v3=p.get(z);
                   int f=l.indexOf(v1);
                   int v2=p.get(f);
                   int v[]={(i+1),(z+1),(f+1)};
                   Arrays.sort(v);
                   s[h]=String.valueOf(v[0])+" "+String.valueOf(v[1])+" "+String.valueOf(v[2]);
                   h++;
                   if(v1==v2 || v2==v3 || v3==v1)
                        break;
                   p.set(i,v3);
                   p.set(z,v2);
                   p.set(f,v1);
                   count++;
               }
               if(count>k)
                    break;
           }
           for(int i=0;i<l.size();i++)
           {
               if(l.get(i)!=p.get(i))
               {
                   g=-1;
                   break;
               }
           }
           if(g==-1)
                System.out.println(-1);
           else
           {
               System.out.println(h);
               for(int i=0;i<h;i++)
               {
                   System.out.println(s[i]);
               }
           }
       }
    }
}
 