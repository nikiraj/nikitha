package guvi;

public class SquareSum {
public static void main(String args[])
{
	int a=234;
	int r=0,mul=1,sum=0,i;
	while(a>0)
	{
		r=a%10;
		mul=1;
		for(i=0;i<r;i++)
		{
			mul=mul*r;
		}
		a=a/10;
		sum=sum+mul;
	}
	System.out.print(sum);
}
}
