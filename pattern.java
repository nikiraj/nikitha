package guvi;

import java.util.Scanner;

public class pattern {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n,i,j;
	n=in.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i;j++)
		{
			System.out.print("*");
		}
		System.out.print(" ");

		for(j=0;j<n-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
