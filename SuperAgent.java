import java.io.*;
import java.util.*;
public class SuperAgent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c[][]=new char[3][3];
        int f=0;
        for(int i=0;i<3;i++)
        {
            String s=sc.next();
            c[f][0]=s.charAt(0);
            c[f][1]=s.charAt(1);
            c[f][2]=s.charAt(2);
            f++;
        }
        if(c[0][0]==c[2][2] && c[0][2]==c[2][0] && c[1][0]==c[1][2] && c[0][1]==c[2][1])
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}