import java.io.*;
import java.util.*;
public class HeidiLearnsHashingE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long r=sc.nextLong();
        if(r<=3)
            System.out.println("NO");
        else if((r-3)%2==0)
            System.out.println(1+" "+((r-3)/2));
        else
            System.out.println("NO");
    }
}
