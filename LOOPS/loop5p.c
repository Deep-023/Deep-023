#include<stdio.h>
#include<conio.h>

void main()
{
    int a,b,i=0,cont=0,sum=0;
    while(i>=0)
    {
     printf("Enter the number: ");   
     scanf("%d",&i);
       
        if (i>0)
       {
           cont++;
           sum= sum+i;
       }
    }
 
    printf("the number of positive numbers entered till now is %d\n",cont);
    printf("The sum of entered positive numbers is %d",sum);

}