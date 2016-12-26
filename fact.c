#include<stdio.h>
void main()
{
 int fact=1,n;
 printf("enter the number:");
 scanf("%d",&n);
 while(n!=0)
 {
  fact=fact*n;
  n--;
  }
  printf("factorial is %d",fact);
  getch();
  }
