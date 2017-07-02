package guvi;
import java.util.*;
public class evenodd {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	String s;
	s=in.nextLine();
	 String even = "";
	    String odd = "";
	    int length = s.length();

	    for (int i = 0; i <= length-2; i+=2) {          
	        even += s.charAt(i+1) + "" + s.charAt(i);
	    }

	    if (length % 2 != 0) {          
	        odd = even + s.charAt(length-1);
	    }
	    if(length%2==0)
	    {
	    	System.out.println(even);
	    }
	    else
	    	System.out.println(odd);
	    	
	   
}
}