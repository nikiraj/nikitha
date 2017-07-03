package guvi;
import java.util.*;
public class ReverseRemve {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	String s,str="",rev="";
	s=in.next();
	int i;
    for(i=s.length()-1;i>=0;i--)
    {
    	str=str+s.charAt(i);
    }
    
    
    for(i=0;i<str.length();i++)
	  if(!(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'||str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'))
	  {
		  rev=rev+str.charAt(i);
	  }
    System.out.print(rev);

}
}
