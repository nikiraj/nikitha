package guvi;

import java.util.Scanner;

public class vowel {
	public static void main(String args[])
	{
		char x;
		Scanner in=new Scanner(System.in);
		x=in.next().charAt(0);
    if((x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u'))
    {
    	System.out.println("vowel");
    }
    else
    	System.out.print("consonant");

}
}
