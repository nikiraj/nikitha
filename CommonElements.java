package guvi;

public class CommonElements {
public static void main(String args[])
{
	int a[]={2,4,6,7,8};
	int b[]={8,6,5,4,3,2};
	int i,j;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
				
			}
		}
	}
}
}
