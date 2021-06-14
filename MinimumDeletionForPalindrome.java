import java.io.*;
import java.util.*;
public class MinimumDeletionForPalindrome
{
    static int palindromeCheck(String s, int f1, int f2)
    {
        if(f1==f2 || f1>f2)
            return 0;
        if(s.charAt(f1)==s.charAt(f2))
            return palindromeCheck(s,f1+1,f2-1);
        return 1+Math.min(palindromeCheck(s,f1,f2-1),palindromeCheck(s,f1+1,f2));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=palindromeCheck(s,0,(s.length()-1));
        System.out.println(ans);
    }
}