import java.io.*;
import java.util.*;
public class RobotProgram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int min=Math.min(x,y);
            int max=Math.max(x,y);
            int ans=(min*2)+((max-min)*2);
            if(x==y)
                System.out.println(ans);
            else
                System.out.println(ans-1);
        }
    }
}