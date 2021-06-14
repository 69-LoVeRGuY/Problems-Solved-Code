import java.io.*;
import java.util.*;
public class AnotherCardGameProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int pc=sc.nextInt();
            int rc=sc.nextInt();
            if(pc<10 && rc<10)
                System.out.println(1+" "+1);
            else if(pc<10)
                System.out.println(0+" "+1);
            else if(rc<10)
                System.out.println(1+" "+1);
            else
            {
                int cdn=pc/9;
                int rdn=rc/9;
                if(pc%9!=0)
                    cdn+=1;
                if(rc%9!=0)
                    rdn+=1;
                if(cdn<rdn)
                    System.out.println(0+" "+cdn);
                else if(cdn>rdn)
                    System.out.println(1+" "+rdn);
                else
                    System.out.println(1+" "+rdn);
            }
        }
    }
}