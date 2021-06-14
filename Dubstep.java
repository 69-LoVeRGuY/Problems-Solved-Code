import java.io.*;
import java.util.*;
public class Dubstep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=s.replaceAll("WUB"," ");
        ans=ans.replaceAll("\\s+"," ");
        ans=ans.trim();
        System.out.println(ans);
    }
}