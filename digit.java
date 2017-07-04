package guvi;

import java.util.Scanner;

public class digit{
public static void main(String args[])
{
	int n,c=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	while(n>0)
	{
		n=n/10;
		c++;
	}
	System.out.print(c);
	
}

}

