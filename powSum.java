package hunter;

import java.util.Scanner;

public class powSum {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n,t,sum=0,m=1,r,i;
	n=in.nextInt();
	t=n%10;
	while(n>0)
	{
		m=1;
		r=n%10;
	for(i=0;i<t;i++)
	{
		m=m*r;
	}
	sum=sum+m;
	n=n/10;
	}
	System.out.print(sum);
	
}
}
