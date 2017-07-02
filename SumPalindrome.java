package guvi;

import java.util.Scanner;

public class SumPalindrome {
public static void main(String args[])
{
	int n,r,sum=0,num,rev=0,t;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println(sum);
	num=sum;
	while(sum>0)
	{
		t=sum%10;
		rev=(rev*10)+t;
		sum=sum/10;
	}
	System.out.println(rev);
	if(rev==num)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.print("not a palindrame");
	}
}
}
