import java.io.*;
import java.util.*;
import java.math.*;
public class ComplicatedGCD
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        String x[]=in.readLine().split(" ");
        BigInteger a=new BigInteger(x[0]);
        BigInteger b=new BigInteger(x[1]);
        if(a.equals(b))
            System.out.println(String.valueOf(a));
        else
            System.out.println(1);
    }
}