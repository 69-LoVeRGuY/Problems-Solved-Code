import java.io.*;
import java.util.*;
public class Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int k1=sc.nextInt();
        int k2=sc.nextInt();
        if(n2>=n1)
            System.out.println("Second");
        else
            System.out.println("First");
    }
}