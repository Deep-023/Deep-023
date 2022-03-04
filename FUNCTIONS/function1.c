#include<stdio.h>
#include<conio.h>

int prime(int a , int b)
{
    int i,j=1,temp=0;
    for(i=a;i<=b;i++)
    {
       for (j=1; j<=i ; j++)
       {
           if (i%j==0)
           {
               temp++;
           }

       }
        if( temp == 2)
        printf("*%d ",i);
        else
        printf("%d ",i);
        if( i%10==0)
        printf("\n");
        temp=0;
    } 
}
int main()
{
    int num1,num2;
    printf("Enter the starting number: ");
    scanf("%d",&num1);
    printf("Enter the last number: ");
    scanf("%d",&num2);

    prime(num1,num2);
    return 0;
}    