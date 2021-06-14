import java.io.*;
import java.util.*;
public class RectangularGameE
{
    static int divchecker(int n)
    {
	for(int i=2;i<=Math.sqrt(n);i++)
	{
	    if(n%i==0)
		return (int)n/i;
	}
	return 1;
}
    public static void main(String args[])
    {
	Scanner input= new Scanner(System.in);
	int n=input.nextInt();
	int ans=n;
	while(n>1)
	{
	    n=divchecker(n);
	    ans+=n;
	}
	System.out.println(ans);
}
}