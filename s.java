import java.io.*;
import java.util.*;
import java.math.*;
public class s
{
    static void chalo(int a[])
    {
        for(int i=0;i<a.length;i++)
            a[i]+=5;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        chalo(a);
        for(int i=0;i<5;i++)
            System.out.print(a[i]);
        System.out.println();
    }
}