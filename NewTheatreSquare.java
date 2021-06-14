import java.io.*;
import java.util.*;
public class NewTheatreSquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            String s[]=new String[n*m];
            for(int i=0;i<n;i++)
                s[i]=sc.next();
            long sum=0;
            for(int j=0;j<n;j++)
            {
                int i=0;
                int a[]=new int[m];
                Arrays.fill(a,0);
                if(s[j].length()==1 && s[j].charAt(0)=='.')
                {
                    sum+=x;
                    continue;
                }
                while(i<s[j].length()-1)
                {
                    if(s[j].charAt(i)=='*')
                    {
                        a[i]=1;
                        i++;
                        continue;
                    }
                    else
                    {
                        if(s[j].charAt(i+1)=='.' && y<=(2*x))
                        {
                            sum+=y;
                            a[i]=1;
                            a[i+1]=1;
                            i=i+2;
                        }
                        else if(s[j].charAt(i+1)=='.' && (2*x)<y)
                        {
                            sum=sum+(2*x);
                            a[i]=1;
                            a[i+1]=1;
                            i=i+2;
                        }
                        else
                        {
                            sum+=x;
                            a[i]=1;
                            i++;
                        }
                    }
                }
                if(s[j].length()>=2)
                {
                    if(s[j].charAt(m-2)!='.' && s[j].charAt(m-1)=='.')
                        sum+=x;
                    else if(a[m-1]==0 && s[j].charAt(m-1)=='.')
                        sum+=x;
                }
            }
            System.out.println(sum);
        }
    }
}