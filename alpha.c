#include<stdio.h>
#include<ctype.h>
main()
{
 char ch;
 printf("\nenter the character:");
 scanf("%c",&ch);
 if(isalpha(ch)>0)
 printf("\nit is an alphabet");
 else
 printf("\nit is not an alphabet");
 getch();
}
