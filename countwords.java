package guvi;
import java.util.*;
public class countwords {
public static void main(String args[])
{
	String s;
	int i,count;
	Scanner in=new Scanner(System.in);
	s=in.nextLine();
	String word[]=s.split(" ");
	count=word.length;
	System.out.print(count);
}
}
