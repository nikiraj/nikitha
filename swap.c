#include<stdio.h>
main()
{
 int a,b,temp;
 printf("enter the values of a and b:");
 scanf("%d %d",a,b);
 temp=a;
 a=b;
 b=temp;
 printf("after swappina a = %d,b= %d"a,b);
 getch();
 return 0;
}
