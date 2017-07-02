package guvi;
import java.util.*;
public class target {
public static void main(String args[])
{
	int a[]=new int[10];
	int n,target,i,j,p=0,q=0,flag=0;
	Scanner in=new Scanner(System.in);
	target=in.nextInt();
	for(i=0;i<10;i++)
	{
		a[i]=in.nextInt();
		
	}
	for(i=0;i<10;i++)
	{
		for(j=0;i<10;j++)
		{
			if(i!=j)
			{
				if(target==a[i]+a[j])
				{
					p=a[i];
					q=a[j];
					flag=1;
					break;
				}
				
			}
		}
		if(flag==1)
		{
			break;
		}
		
	}
	System.out.println(p+" "+q);
	
}
}
