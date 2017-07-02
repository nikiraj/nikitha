package guvi;

import java.util.Scanner;

public class ReverseWords {
public static void main(String args[])
{
	String s,word="";
	int i;
	Scanner in=new Scanner(System.in);
	s=in.nextLine();
	String[] words=s.split(" ");
	for(i=words.length-1;i>=0;i--)
	{
		word=word+words[i]+" ";
	}
	System.out.println(word);
	
}
}
