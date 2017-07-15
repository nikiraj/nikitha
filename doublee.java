package guvi;
import java.util.*;
public class doublee {
public static void main(String[] args) {
	String s,str,str1;
	Scanner in=new Scanner(System.in);
	s=in.next();
	int l=s.length()/2;
	str=s.substring(0,l);
	str1=s.substring(l);
	if(str.equals(str1))
	{
		System.out.println("the string is double");
	}
	else
		System.out.println("not double");
	

	}
}

