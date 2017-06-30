package guvi;

public class closestZero {
public static void main(String args[])
{
	int a[]={-2,4,5,-3,8,-5,-1};
	int pre=0;
	int b1=0,b2=0;
	int l=a.length;
	int i,j;
	for(i=0;i<l;i++)
	{
		for(j=0;j<l;j++)
		{ if(i!=j)
		{
			         int sum=a[i]+a[j];
			         if(pre==0)
			             pre=sum;
			         if(sum > 0){
			             if(sum < pre ){
			                 pre=sum;
			                 b1=a[i];
			                 b2=a[j];
			             }
			         }
			         else if(sum < 0){
			             if(-sum < pre){
			                 pre=sum;
			                 b1=a[i];
			                 b2=a[j];
			             }
			         }
			     }
			 }
	}

			    System.out.println(b1+" "+b2);
		}
	}

