import java.io.*;
import java.util.*;
public class HitTheLottery
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n/100+(n%100)/20+(n%20)/10+(n%10)/5+(n%5));
    }
}