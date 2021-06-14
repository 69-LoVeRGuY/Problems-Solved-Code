import java.io.*;
import java.util.*;
public class CreatingStrings
{
    static TreeSet<String> list=new TreeSet();
     static String swap(String str, int i, int j)
     {
        char ch;
        char[] array = str.toCharArray();
        ch = array[i];
        array[i] = array[j];
        array[j] = ch;
        return String.valueOf(array);
    }
    // Function to print all the permutations of the string
    static void permute(String str,int low,int high)
    {
        if(low == high)
            list.add(str);
 
        int i;
        for(i = low; i<=high; i++)
        {
            str = swap(str,low,i);
            permute(str, low+1,high);
            str = swap(str,low,i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char ch[]=s.toCharArray();
        int a[]=new int[26];
        for(int i=0;i<n;i++)
            a[((char)(s.charAt(i)-97))]++;
        int total=1;
        for(int i=n;i>=1;i--)
            total*=i;
        for(int i=0;i<26;i++)
        {
            if(a[i]>1)
            {
                int div=1;
                for(int j=2;j<=a[i];j++)
                    div*=j;
                total/=div;
            }
        }
        System.out.println(total);
        permute(s,0,n-1);
        for(String value : list)
            System.out.println(value);
    }
}