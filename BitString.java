import java.io.*;
import java.util.*;
import java.math.*;
public class BitString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger t=new BigInteger("2");
        BigInteger mod=new BigInteger("1000000007");
        t=t.pow(n);
        t=t.mod(mod);
        System.out.println(t);
    }
}