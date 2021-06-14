import java.io.*;
import java.util.*;
public class BobonuiColourBalls
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int r=sc.nextInt();
            int g=sc.nextInt();
            int b=sc.nextInt();
            int w=sc.nextInt();
            int counter[]=new int[2];
            counter[r%2]++;
            counter[g%2]++;
            counter[b%2]++;
            counter[w%2]++;
            int ans=0;
            if(counter[0]==4)
                System.out.println("Yes");
            else if(counter[0]==3 && counter[1]==1)
		System.out.println("Yes");
	    else	
	    {
	        int times=0;
			while(r>0 && b>0 && g>0 && times<2)
			{
				times++;
				r =r-1;
				b = b-1;
				g = g-1;
				w = w+3;
				int check[]=new int[2];
				check[r%2]++;
				check[g%2]++;
				check[b%2]++;
				check[w%2]++;
				if(check[0]==4)
				{
					System.out.println("Yes");
					ans=1;
					break;
				}
				else if(check[0]==3 && check[1]==1)
				{
					System.out.println("Yes");
					ans=1;
					break;
				}
				
			}
			if(ans==0)
				System.out.println("No");
		}
}
}
}