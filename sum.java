package guvi;

import java.util.Scanner;

public class sum{
public static void main(String args[])
{
	int n,c=0,i,sum=0,num,r=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	num=n;
	while(n>0)
	{
		n=n/10;
		c++;
	}
	for(i=0;i<c;i++)
	{
		r=num%10;
		sum=sum+r;
		num=num/10;
	}
	System.out.print(sum);
	
}

}

