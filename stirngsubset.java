package guvi;

import java.util.Scanner;

public class stirngsubset {
public static void main(String args[])
{
	String s1,s2;
	Scanner in=new Scanner(System.in);
	s1=in.next();
	s2=in.next();
	if(s1.contains(s2))
	{
		System.out.print(s1.indexOf(s2));
	}
}
}
