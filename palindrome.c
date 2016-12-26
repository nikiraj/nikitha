#include<stdio.h>
int main()
{
 int num,temp,r=0,tem;
 printf("enter the number:");
 scanf("%d",&num);
 temp=num;
 while(temp!=0)
 {
 r=r*10;
 r=r+temp%10;
 temp=temp/10;
}
 if(num==r)
 printf("it is a palindrome");
 else
 printf("not a palindrome");
 getch();
 }
