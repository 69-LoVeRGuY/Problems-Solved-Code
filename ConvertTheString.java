import java.io.*;
import java.util.*;
public class ConvertTheString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int f=0,count=0;
            List<Integer> al=new ArrayList();
            for(int i=0;i<n;i++)
            {
                String ch="";
                ch+=b.charAt(i);
                if(a.charAt(i)!=b.charAt(i) && a.contains(ch)==false)
                {
                    f=-1;
                    break;
                }
                if(a.charAt(i)!=b.charAt(i) && b.charAt(i)=='a')
                {
                    int total=1;
                    List<Integer> temp=new ArrayList();
                    temp.add(i);
                    for(int j=i+1;j<n;j++)
                    {
                        if(a.charAt(j)!=b.charAt(j) && b.charAt(j)==b.charAt(i))
                        {
                            total++;
                            temp.add(j);
                        }
                    }
                    al.add(total+1);
                    temp.add(a.indexOf(b.charAt(i)));
                    Collections.sort(temp);
                    al.addAll(temp);
                    count++;
                }
            }
            if(f==-1)
                System.out.println(-1);
            else
            {
                System.out.println(count);
                int i=0;
                while(i<al.size())
                {
                    int x=al.get(i);
                    for(int j=i;j<i+x+1;j++)
                        System.out.print(al.get(j)+" ");
                    System.out.println();
                    i=i+x+1;
                }
            }
        }
    }
}