package guvi;

public class FindUnique {
public static void main(String args[])
{
	int a[]={1,1,2,2,3,4,3,4,6,7,7};
	int l=a.length,flag=0,num=0;
	for(int i=0;i<l;i++)
	{ flag=0;
		for(int j=0;j<l;j++)
		{
			if(i!=j)
			{
				if(a[i]==a[j])
				{
					flag=1;
					break;
				}
				
			}
		}
		if(flag==0)
		{
			num=a[i];
			break;
		}
	}
	System.out.print(num);
}
}
