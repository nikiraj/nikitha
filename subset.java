package guvi;

import java.util.Scanner;

public class subset {
public static void main(String args[])
{
	int a1[]=new int[5];
	int a2[]=new int[10];
	int count=0;
	Scanner in=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		a1[i]=in.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		a2[i]=in.nextInt();
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(a1[i]==a2[j])
			{
				count++;
				break;
			}
			
		}
	}
	if(count==5)
	{
		System.out.print("a1 is the subset of a2");
	}else
		System.out.print("a1 is not the subset of a2aa");

}
}
