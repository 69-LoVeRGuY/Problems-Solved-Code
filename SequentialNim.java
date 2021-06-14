import java.io.*;import java.util.*;
public class SequentialNim
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int one=0,eloc=-1,oloc=-1;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]==1)
                {
                    one++;
                }
                else
                {
                    if((i+1)%2==0 && eloc==-1)
                        eloc=i+1;
                    else if((i+1)%2!=0 && oloc==-1)
                        oloc=i+1;
                }
            }
            if(one==0)
                System.out.println("First");
            else if(one==n)
            {
                if(n%2==0)
                    System.out.println("Second");
                else
                    System.out.println("First");
            }
            else
            {
                if(eloc!=-1 && oloc==-1)
                    System.out.println("Second");
                else if(oloc!=-1 && eloc==-1)
                    System.out.println("First");
                else if(eloc!=-1 && oloc!=-1)
                {
                    if(eloc<oloc)
                        System.out.println("Second");
                    else
                        System.out.println("First");
                }
            }
        }
    }
}