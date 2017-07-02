package guvi;

import java.util.Scanner;

public class FourthTallest {
public static void main(String args[])
{
	int a[]=new int[50];
	int t,n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(int i=0;i<50;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<50;i++)
	{
		for(int j=0;j<10;j++)
		{if(a[i]>a[j]){
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		}
	}
		System.out.println(a[3]);
		System.out.println(a[n-1]);

	
}
}
