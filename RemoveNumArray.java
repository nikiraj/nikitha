package guvi;

import java.util.Scanner;

public class RemoveNumArray {
public static void main(String args[])
{
	int a[]={2,4,5,6,7,4,5};
	int l,n,i,j=0,t,count=0;
	l=a.length;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int b[]=new int[l];
   for(i=0;i<l;i++){
	   t=a[i];
		if(a[i]!=n)
		{
			b[j]=t;
			j++;
			count++;
		
		}
	}
for(i=0;i<count;i++)
{
	System.out.print(b[i]+" ");
}
}
}
