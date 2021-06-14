import java.io.*;
import java.util.*;
public class UniqueNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            
            if(n>45)
            {
                System.out.println("-1");
                continue;
            }
            if(n<=9)
                System.out.println(n);
            else
            {
                List<Integer> list=new ArrayList();
                int sum = 0;
		for(int i=9;i>=1;i--)
		{
		    if(sum + i<=n)
		    {
			list.add(i);
			sum = sum + i;
			if(sum==n)
			     break;
			 }
			 else
				break;
		}
				int diff = n-sum;
				if(diff!=0)
					list.add(diff);
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		  System.out.print(list.get(i));
		 System.out.println();
}
}
}
}