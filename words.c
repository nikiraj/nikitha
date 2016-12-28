#include<stdio.h>
#include<conio.h>
void main()
{
 int j,i,cntword=0;
 char sent[100];
 printf("Enter a sentence\n");
 gets(sent);
 for(i=0;sent[i]!='\0';i++);
 for(j=0;j<=i;j++)
 {
  if(sent[j]==' '||sent[j]=='\0'||sent[j]=='\t')
  {
   cntword++;
   while(sent[j+1]==' '||sent[j+1]=='\0'||sent[j+1]=='\t')
    i++;
  }
 }
 printf("Number of word in a sentence are = %d",cntword);
 getch();
}
