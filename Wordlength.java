package guvi;

public class Wordlength {
	public static void main(String args[]){
String s="my name is niki";
String w="",str="";
int i,l,c=0,val=0;
String words[]=s.split(" ");
for(i=0;i<words.length;i++)
{
	w=words[i];
	l=w.length();
	if(l>c)
	{
	 c=l;
		val=i;
	}
}
System.out.print(words[val]);


}
}
