#include<stdio.h>
int main()
{
 char str[20],count=0,i=0;
 printf("enter the string:");
 scanf("%s",&str);
 while(str[i]!='\0')
 {
 count++;
 i++;
 }
 printf("number of charcters is %d",count);
 getch();
 return 0;
 }
