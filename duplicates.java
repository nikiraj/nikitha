package guvi;
import java.util.*;
public class duplicates {
	public static void main(String args[]){
	  String s,str="";
      Scanner in=new Scanner(System.in);
      s=in.nextLine();
      int i,j;
      char[] c=s.toCharArray();
      for(i=0;i<s.length();i++)
      {
          for(j=i+1;j<s.length();j++)
          {
          if(c[i]==c[j])
          {
             c[j]=0; 
          }
      }
  }
      for(i=0;i<s.length();i++)
      { if(c[i]!=0)
      {
          str=str+c[i];
          }
      }
      
  System.out.print(str);
}
}


