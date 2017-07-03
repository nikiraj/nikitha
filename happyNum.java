package guvi;

import java.util.Scanner;

public class happyNum {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n,sum=0,r;
	n=in.nextInt();
	sum=n;
	do{
		n=sum;
		sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r;
			n=n/10;
		}
	}while(sum>9);
	if(sum==1)
	{
		System.out.println("happy number");
	}
		else
		System.out.println("not a happy number");
	
}
}
