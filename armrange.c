#include<stdio.h>
#include<conio.h>
void main()
{
  int num, n, rem,sum;
  int cube=0,a,b;
  printf("\n Armstrong numbers between 100 and 999 are: \n");
  printf("enter the range:");
  scanf("%d %d",&a,&b);
  for(num=a;num<=b;num++)
  {
    n=num;
    sum=0;
    do
    {
      rem=n%10;
      cube=rem*rem*rem;
      sum=sum+cube;
      n=n/10;
    }while(n>0);

    if(num==sum)
     printf("\n%d is armstrong number",num);    }
  getch();

}
