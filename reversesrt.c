#include<stdio.h>
void main()
{
 char string[20],temp;
 int i=0,j;
 printf("enter the string:");
 scanf("%s",&string);
 j=strlen(string)-1;
 while(i<j)
 {
 temp=string[i];
 string[i]=string[j];
 string[j]=temp;
 i++;
 j--;
 }
 printf("reverse of a string is:%s\n",string);
 getch();
 return 0;
 }
