package guvi;
import java.util.*;
public class prime {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int m,n,flag=0,i,j;
	m=in.nextInt();
	n=in.nextInt();
	for(i=m;i<=n;i++)
	{flag=0;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		System.out.println(i);
		}
	}
}
}
