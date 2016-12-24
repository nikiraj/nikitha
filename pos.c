#include<stdio.h>
void main()
{
int n;
printf("\n enter the number");
scanf("%d",&n);
if(n>0)
{
printf("\n the number is positive integer",n);
}
else if(n<0)
{
printf("\n the number is negative",n);
}
else
{
printf("\n you entered the value zero");
}
getch();
}
