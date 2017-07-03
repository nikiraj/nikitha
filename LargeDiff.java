package guvi;
import java.util.*;
public class LargeDiff {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int i;
	int large=-111;
	int n=in.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	int temp;
	int index1=0;
	for(i=0;i<n-1;i++){
		temp=arr[i]-arr[i+1];
		temp=Math.abs(temp);
		System.out.print(" "+temp);
		if(temp>large)
		{
			large=temp;
			index1=i;
		}
	}	
	System.out.println();
	System.out.println(index1);

}

}

