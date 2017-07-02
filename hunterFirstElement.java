package guvi;

import java.util.Scanner;

public class hunterFirstElement {
public static void main(String args[])
{
	int a[]=new int[10];
	int flag=0;
	Scanner in=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{ a[i]=in.nextInt();
		}
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(i!=j)
			{
				if(a[i]==a[j])
				flag=1;
				
			}
		}
		if(flag==1)
		{System.out.println(a[i]);
			break;
		}
		
	}
	
}
}
