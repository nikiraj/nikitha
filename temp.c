#include<stdio.h>
int main()
{
 int n,temp;
 printf("enter the number:");
 scanf("%d",&n);
while(n!=0){
  temp=n%10;
  printf("%d",temp);
  n=n/10;
 }
 getch();
 return 0;
 }
